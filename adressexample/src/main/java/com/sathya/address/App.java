package com.sathya.address;

    	import org.springframework.context.ApplicationContext;
    	import org.springframework.context.support.ClassPathXmlApplicationContext;

    	public class App 
    	{
    	    public static void main( String[] args )
    	    {
    		  
			@SuppressWarnings("resource")
			ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
    	       EmployeeBean e1=(EmployeeBean)ctx.getBean("id2");
    	       e1.Printemp();
    	       
    	    }
    	}

