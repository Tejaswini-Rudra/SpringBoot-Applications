package com.sathya.collection;

import java.util.List;

public class ProductBean {
	private int  proid;
	private String proname;
	private List<ModelBean>modelmb;

public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public List<ModelBean> getModelmb() {
		return modelmb;
	}

	public void setModelmb(List<ModelBean> modelmb) {
		this.modelmb = modelmb;
	}

public void printproduct(){
	System.out.println("product is"+getProid()+""+getProname()+" "+getModelmb());
	
}
}
