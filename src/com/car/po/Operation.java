package com.car.po;

public class Operation {

	public int opId;
	public String opName;
	public int getOpId() {
		return opId;
	}
	public void setOpId(int opId) {
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
		return "Operation [opId=" + opId + ", opName=" + opName + "]";
	}
	
}
