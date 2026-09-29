package org.jsp.Demo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeByIDAndSalary {
	public static void main(String[] args)
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		
		Scanner sc=new Scanner(System.in);

		Query<Employee>q=ses.createQuery("Select e from Employee e where eid=?1 and sal >?2");
		
		System.out.println("Enter the Id");
		q.setParameter(1,sc.nextInt());
		System.out.println("Enter the Salary");
		q.setParameter(2,sc.nextDouble());
		
		try
		{
			Employee e=q.getSingleResult();
			System.out.println(e);
		}
		catch(NoResultException e)
		{
			System.err.println("No Record Found ");
		}
		
		
		
	}
}
