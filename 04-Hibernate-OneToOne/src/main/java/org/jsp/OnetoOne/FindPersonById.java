package org.jsp.OnetoOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPersonById {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id to Find Record : ");
		
		Person p=em.find(Person.class,sc.nextInt());
		
		if(p!=null)
		{
			System.out.println(p);
		}
		else
		{
			System.err.println("No Recod Found");
		}
		
		sc.close();
		em.close();
		emf.close();
		
	}
}
