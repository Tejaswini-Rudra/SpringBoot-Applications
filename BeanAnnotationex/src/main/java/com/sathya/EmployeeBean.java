package com.sathya;
import java.util.List;
import java.util.Map;


public class EmployeeBean {

	private int empId;
	private List<Integer>empProjects;
	private Map<String,Integer> empMap;
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
	public List<Integer> getEmpProjects() {
		return empProjects;
	}
	public void setEmpProjects(List<Integer> empProjects) {
		this.empProjects = empProjects;
	}
	public Map<String, Integer> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<String, Integer> empMap) {
		this.empMap = empMap;
	}
	
	
	
}