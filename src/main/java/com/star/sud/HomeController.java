package com.star.sud;

import java.net.URLDecoder;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.star.sud.form.PageForm;
import com.star.sud.message.StarMessage;
import com.star.sud.message.StarMessageCode;
import com.star.sud.message.StarMessageType;

@Controller
public class HomeController {

	protected static final String STAR_MESSAGE = "starMessage";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {

		model.addAttribute("pageForm", new PageForm());

		return "home/home";
	}

	@RequestMapping(value = "/urlEncoder", method = RequestMethod.POST)
	public String urlEncoder(Model model, @ModelAttribute("pageForm") PageForm pageForm) {

		StarMessage starMessage = null;
		StarMessageType msgType = null;

		String msg = null;
		try {

			if (null == pageForm)
				throw new Exception("Input Param is Null");

			String inData = pageForm.getEncodeInput();
			String encodedStr = URLEncoder.encode(inData, "UTF-8");
			pageForm.setEncodeOutput(encodedStr);
			model.addAttribute("pageForm", pageForm);

			msg = "Successfully Encoder the Url";
			msgType = StarMessageType.SUCCESS;

		} catch (Exception e) {
			msg = e.getMessage();
			msgType = StarMessageType.ERROR;
		}

		starMessage = new StarMessage().code(StarMessageCode.INFORMATION).message(msg).type(msgType);
		model.addAttribute(STAR_MESSAGE, starMessage);
		return "home/home";

	}

	@RequestMapping(value = "/urlDecoder", method = RequestMethod.POST)
	public String urlDecoder(Model model, @ModelAttribute("pageForm") PageForm pageForm) {

		StarMessage starMessage = null;
		StarMessageType msgType = null;

		String msg = null;
		try {

			if (null == pageForm)
				throw new Exception("Input Param is Null");

			String inData = pageForm.getDecodeInput();
			String decodedStr = URLDecoder.decode(inData, "UTF-8");
			pageForm.setDecodeOutput(decodedStr);
			model.addAttribute("pageForm", pageForm);

			msg = "Successfully Decoded the Url";
			msgType = StarMessageType.SUCCESS;

		} catch (Exception e) {
			msg = e.getMessage();
			msgType = StarMessageType.ERROR;
		}

		starMessage = new StarMessage().code(StarMessageCode.INFORMATION).message(msg).type(msgType);
		model.addAttribute(STAR_MESSAGE, starMessage);
		return "home/home";
	}

}
