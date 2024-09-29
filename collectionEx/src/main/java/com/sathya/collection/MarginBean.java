package com.sathya.collection;

public class MarginBean {
	private int marginid;
	private String marginCode;
	public int getMarginid() {
		return marginid;
	}
	public void setMarginid(int marginid) {
		this.marginid = marginid;
	}
	public String getMarginCode() {
		return marginCode;
	}
	public void setMarginCode(String marginCode) {
		this.marginCode = marginCode;
	}
	@Override
	public String toString() {
		return "MarginBean [marginid=" + marginid + ", marginCode=" + marginCode + "]";
	}
}