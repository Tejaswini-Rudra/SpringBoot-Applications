package com.sathya.address;

public class EmployeeBean {
	private int empId;
	private String empName;
	private AddressBean addr;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeBean(int empId, String empName, AddressBean addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}
public void Printemp() {
	System.out.println(empId);
	System.out.println(empName);
	System.out.println(addr);
}
	
	
	
}
