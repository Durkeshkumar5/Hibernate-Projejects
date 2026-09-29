package org.jsp.jpsDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Primary Key");
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		
		Merchant m=em.find(Merchant.class, sc.nextInt());
		if(m!=null)
		{
			em.remove(m);
			etran.commit();
		}
		else
		{
			System.err.println("No Record found since PK is in valid");
		}
		
		sc.close();
	}
}
