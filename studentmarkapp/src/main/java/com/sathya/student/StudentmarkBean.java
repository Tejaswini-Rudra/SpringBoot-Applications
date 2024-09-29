package com.sathya.student;


public class StudentmarkBean {

	private int stdId;
	private String stdname;
	private int sub1;
	private int sub2;
	private int sub3;
	//PDC+PSM+PGM+BM
	
	
	public StudentmarkBean() {
		super();
		
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname= stdname;
	}
	
	
	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public void printMarks()
	{
	int total=0;
	double percantage=0.0;
	String result=null;
	String grade=null;
	System.out.println(sub1+"\t"+sub2+"\t"+sub3);
	total=sub1+sub2+sub3;
	percantage=total/3;
	if(percantage>=70) {
		grade="A Grade";
	}
	else if(percantage>=60) {
		grade="B Grade";
	}
	else if(percantage>=50) {
		grade="C Grade";
	}
	if(sub1>=35&&sub2>=35&&sub3>=35){
		result="pass";
		
	}
	else {
		result="fail";
	}
	System.out.println("total="+total);
	System.out.println("percantage="+percantage);
	System.out.println("result="+result);
	System.out.println("grade="+grade);
	}
	
	

	}
