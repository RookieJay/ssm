package com.car.form;

public class PassageForm {

	public String psId;
	public String psTitle;
	public String psImg;
	public String psContent;
	public String opName;
	public String getPsId() {
		return psId;
	}
	public void setPsId(String psId) {
		this.psId = psId;
	}
	public String getPsTitle() {
		return psTitle;
	}
	public void setPsTitle(String psTitle) {
		this.psTitle = psTitle;
	}
	public String getPsImg() {
		return psImg;
	}
	public void setPsImg(String psImg) {
		this.psImg = psImg;
	}
	public String getPsContent() {
		return psContent;
	}
	public void setPsContent(String psContent) {
		this.psContent = psContent;
	}
	public String getOpName() {
		return opName;
	}
	public void setOpName(String opName) {
		this.opName = opName;
	}
	@Override
	public String toString() {
		return "PassageForm [psId=" + psId + ", psTitle=" + psTitle + ", psImg=" + psImg + ", psContent=" + psContent
				+ ", opName=" + opName + "]";
	}
	
}
