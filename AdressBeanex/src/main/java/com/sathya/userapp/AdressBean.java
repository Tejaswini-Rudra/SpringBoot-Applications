package com.sathya.userapp;

public class AdressBean {
	private int hno;
	private String city;
	private  String state;
	public AdressBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AdressBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	

}
