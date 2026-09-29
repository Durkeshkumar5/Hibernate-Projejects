package org.jsp.Demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertEmployee {

	public static void perform() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory self=conf.buildSessionFactory();
		Session ses =self.openSession();
		Transaction tran=ses.getTransaction();
		
		System.out.println("Enter the Number of Records to be inserted");
		Scanner sc=new Scanner(System.in);
		
		tran.begin();
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=n;i++)
		{
			Employee e=new Employee();
			
			System.out.println("Enter the Name to Insert :");
			e.setName(sc.nextLine());
			
			System.out.println("Enter the Ph_No to Insert :");
			e.setPhone(sc.nextLong());
			sc.nextLine();
			
			System.out.println("Enter the Email to Insert :");
			e.setEmail(sc.nextLine());
			
			System.out.println("Enter the Desigination to Insert :");
			e.setDesigination(sc.nextLine());
			
			System.out.println("Enter the Salary to Insert :");
			e.setSalary(sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Enter the Password to Insert :");
			e.setPass(sc.nextLine());
			
			ses.save(e);
			System.out.println("Record Inserted Sucessfully");
			
		}
		
		tran.commit();
		sc.close();
		ses.close();
		self.close();
	}
	
}
