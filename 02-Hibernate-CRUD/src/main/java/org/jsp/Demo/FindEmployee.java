package org.jsp.Demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindEmployee {

	public static void perform() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory self=conf.buildSessionFactory();
		Session ses =self.openSession();
		Transaction tran=ses.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id : ");
	
		tran.begin();
		
		Employee e=ses.get(Employee.class,sc.nextInt());
		if(e!=null)
		{
			System.out.println(e);
		}
		else
		{
			System.err.println("No Record Found");
		}
		
		tran.commit();
		sc.close();
		ses.close();
		self.close();
	}

}
