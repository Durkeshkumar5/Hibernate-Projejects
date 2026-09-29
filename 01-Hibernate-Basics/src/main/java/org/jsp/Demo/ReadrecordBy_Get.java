package org.jsp.Demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadrecordBy_Get {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Primary key");
		Employee e=ses.get(Employee.class,sc.nextInt());
		
		System.out.println();
		
		System.out.println(e);
		
		System.out.println();
		System.out.println(e.getId());
		System.out.println(e.getName());
		
	}
}
