package org.jsp.Demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadrecordBy_Load {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Primary Key");
		
		Employee e=ses.load(Employee.class,sc.nextInt());
		System.out.print(e.getId());
		System.out.print(e.getName());

		
		
	}
}
