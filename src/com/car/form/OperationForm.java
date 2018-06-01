package com.car.form;

public class OperationForm {

	public String opId;
	public String opName;
	public String getOpId() {
		return opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}
	public String getOpName() {
		return opName;
	}
	public void setOpName(String opName) {
		this.opName = opName;
	}
	@Override
	public String toString() {
		return "OperationForm [opId=" + opId + ", opName=" + opName + "]";
	}
	
}
