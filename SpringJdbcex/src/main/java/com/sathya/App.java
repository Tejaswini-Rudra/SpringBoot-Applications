

package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
  	  ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
  	  UserBean scb=(UserBean)ctx.getBean("id3");
  	  
  	  //scb.createtable();
  	 // scb.inserttable();
  	 // scb.deleteuser();
         //scb.findById();
  	  //scb.updateuser();
  	  scb.findAll();

    }
}