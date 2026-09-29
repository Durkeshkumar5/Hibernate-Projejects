package org.jsp.Demo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyPhoneAndPass {

	public static void perform() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		
		Scanner sc=new Scanner(System.in);

		Query<Employee>q=ses.createQuery("from Employee e where e.phno=?1 and e.pass=?2",Employee.class);
		
		System.out.println("Enter the Phone_Number");
		q.setParameter(1,sc.nextLong());
		sc.nextLine();
		
		System.out.println("Enter the Password");
		q.setParameter(2,sc.nextLine());
		
		try
		{
			Employee e=q.getSingleResult();
			System.out.println(e);
		}
		catch(NoResultException e)
		{
			System.err.println("No Record Found ");
		}
		
		sc.close();
		ses.close();
		sef.close();
	}
	
}
