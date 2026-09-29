package org.jsp.Demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
	public static void perform() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory self=conf.buildSessionFactory();
		Session ses =self.openSession();
		Transaction tran=ses.getTransaction();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id to Update the record : ");
		
		tran.begin();
		
		Employee e=ses.get(Employee.class,sc.nextInt());
		sc.nextLine();
		
		if(e==null)
		{
			
			System.out.println("No Record Found ");
			sc.close();
			ses.close();
			self.close();
			return;
		}
		
		System.out.println("--> Enter the Update Options : <--");
		System.out.println("1.Enter the Name to Update Record :");
		System.out.println("2.Enter the Phone_NUmber to  Record :");	
		System.out.println("3.Enter the Email to Update Record :");
		System.out.println("4.Enter the Desigination to Update Record :");
		System.out.println("5.Enter the to Salary Update Record :");	
		System.out.println("6.Enter the to Password Update Record :");
		int n=sc.nextInt();
		sc.nextLine();
		
		switch(n){
		
		case 1:
			System.out.println("Enter the New Name :");
			e.setName(sc.nextLine());
			break;
			
		case 2:
			System.out.println("Enter the New Phone_Number :");
			e.setPhone(sc.nextLong());
			sc.nextLine();
			break;
			
		case 3:
			System.out.println("Enter the New Email :");
			e.setEmail(sc.nextLine());
			break;
			
		case 4:
			System.out.println("Enter the New Desigination :");
			e.setDesigination(sc.nextLine());
			break;
			
		case 5:
			System.out.println("Enter the New Salary :");
			e.setSalary(sc.nextDouble());
			sc.nextLine();
			break;
			
		case 6:
			System.out.println("Enter the New Password :");
			e.setPass(sc.nextLine());
			break;
			
		}
		
		tran.commit();
		sc.close();
		ses.close();
		self.close();
		
	}

}
