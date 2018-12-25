package com.star.sud.form;

/*@Author Sudarshan*/
public class PageForm {

	// Attributes
	/////////////
	private String encodeInput;
	private String encodeOutput;
	private String decodeInput;
	private String decodeOutput;

	// Override Methods
	///////////////
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PageForm [encodeInput=" + encodeInput + ", encodeOutput=" + encodeOutput + ", decodeInput="
				+ decodeInput + ", decodeOutput=" + decodeOutput + "]";
	}

	// Properties
	/////////////
	/**
	 * @return the encodeInput
	 */
	public String getEncodeInput() {
		return encodeInput;
	}

	/**
	 * @param encodeInput
	 *            the encodeInput to set
	 */
	public void setEncodeInput(String encodeInput) {
		this.encodeInput = encodeInput;
	}

	/**
	 * @return the encodeOutput
	 */
	public String getEncodeOutput() {
		return encodeOutput;
	}

	/**
	 * @param encodeOutput
	 *            the encodeOutput to set
	 */
	public void setEncodeOutput(String encodeOutput) {
		this.encodeOutput = encodeOutput;
	}

	/**
	 * @return the decodeInput
	 */
	public String getDecodeInput() {
		return decodeInput;
	}

	/**
	 * @param decodeInput
	 *            the decodeInput to set
	 */
	public void setDecodeInput(String decodeInput) {
		this.decodeInput = decodeInput;
	}

	/**
	 * @return the decodeOutput
	 */
	public String getDecodeOutput() {
		return decodeOutput;
	}

	/**
	 * @param decodeOutput
	 *            the decodeOutput to set
	 */
	public void setDecodeOutput(String decodeOutput) {
		this.decodeOutput = decodeOutput;
	}

}
