package com.sathya;

import java.util.Iterator;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;



public class UserBean {
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void createtable() {
		jt.execute("create table users(user_id number(38),name varchar2(40),email varchar2(40))");
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
	public void updateuser() {
		int i=jt.update("update users set name='teju' ,email='teju@1222' where user_id=103");
		System.out.println("user updated"+i);
	}
	public void findById() {
		
		List i=jt.queryForList("select * from users where user_id =102");
		
		Iterator it=i.iterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob.toString());
		}
		
	}
	public void findAll() {
		List j=jt.queryForList("select * from users");
		Iterator it=j.iterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob.toString());
		}
	}
	
}