package org.jsp.OnetoOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPancardByPerson_Id {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Person_Id to Find Pancard Record : ");
		Person ps=em.find(Person.class, sc.nextInt());
		
		if(ps!=null)
		{
			System.out.println(ps.getCard());
		}
		else
		{
			System.err.println("No Record Found");
		}
		
		sc.close();
		em.close();
		emf.close();
	}
}
