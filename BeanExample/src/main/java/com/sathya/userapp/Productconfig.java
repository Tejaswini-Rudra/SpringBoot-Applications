package com.sathya.userapp;


import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Productconfig {
	
	@Bean("id1")
	public ProductBean getProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid,pname,price,quantity...");
		int pid=sc.nextInt();
		String pname=sc.next();
		int quantity=sc.nextInt();
		double price=sc.nextDouble();
		ProductBean p1=new ProductBean(pid,pname,price,quantity);
		
		return p1;
		
	}
	

}