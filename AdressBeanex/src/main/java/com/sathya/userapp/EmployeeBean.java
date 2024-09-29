package com.sathya.userapp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;




public class EmployeeBean {
	private int empId;
	private String empname;
	@Autowired
	@Qualifier("permanentAddress")
	private AdressBean addr;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public AdressBean getAddr() {
		return addr;
	}
	public void setAddr(AdressBean addr) {
		this.addr = addr;
	}

	public void printemployee() {
		System.out.println(empId);
		System.out.println(empname);
		System.out.println(addr);
	}
}











