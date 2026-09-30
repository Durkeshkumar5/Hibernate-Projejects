package org.jsp.OnetoOne;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FindPancardById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enther Pancard Id to Find Record : ");
		Pancard pn=em.find(Pancard.class, sc.nextInt());
		
		if(pn!=null)
		{
			System.out.println(pn);
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
