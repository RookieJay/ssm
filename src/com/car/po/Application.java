package com.car.po;

public class Application {

	int appId;
	String appName;
	String appEmail;
	String appTel;
	String thoughts;
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppEmail() {
		return appEmail;
	}
	public void setAppEmail(String appEmail) {
		this.appEmail = appEmail;
	}
	public String getAppTel() {
		return appTel;
	}
	public void setAppTel(String appTel) {
		this.appTel = appTel;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appName=" + appName + ", appEmail=" + appEmail + ", appTel=" + appTel
				+ ", thoughts=" + thoughts + "]";
	}
	
	
}
