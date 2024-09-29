package com.sathya.collection;


import java.util.Map;

public class ModelBean {
	private int modelid;
	private String modelcode;
	private double modelprice;
	private Map<String,MarginBean>Marginmgob ;
	public int getModelid() {
		return modelid;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	public String getModelcode() {
		return modelcode;
	}
	public void setModelcode(String modelcode) {
		this.modelcode = modelcode;
	}
	public double getModelprice() {
		return modelprice;
	}
	public void setModelprice(double modelprice) {
		this.modelprice = modelprice;
	}
	public Map<String, MarginBean> getMarginmgob() {
		return Marginmgob;
	}
	public void setMarginmgob(Map<String, MarginBean> marginmgob) {
		this.Marginmgob = marginmgob;
	}
	@Override
	public String toString() {
		return "ModelBean [modelid=" + modelid + ", modelcode=" + modelcode + ", modelprice=" + modelprice
				+ ", Marginmgob=" + Marginmgob + "]";
	}
	
}