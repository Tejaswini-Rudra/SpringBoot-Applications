package com.sathya;

import org.springframework.jdbc.core.JdbcTemplate;

public class MobileBean {
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void createtable() {
		jt.execute("create table Mobile(modelno number(10)primary key,modelname varchar2(30),compname varchar2(20),price number,ram number(20),rom number(20),os varchar2(20),processor number,fcam-size number(20),bcam-size number(20),imei- number");
		System.out.println("table created sucessfully............");
}
	public void inserttable() {
		int i=jt.update("insert into users values(103,'sathya','sathya@gmail')");
		System.out.println("data inserted sucessfully"+i);
		
	}
	
	public void deleteuser() {
		int i=jt.update("delete from users where user_id='101'" );
		System.out.println("data deleted sucessfully"+i);
	}
	
	
}