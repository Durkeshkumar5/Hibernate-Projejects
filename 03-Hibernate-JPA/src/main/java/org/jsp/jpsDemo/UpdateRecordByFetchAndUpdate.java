package org.jsp.jpsDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecordByFetchAndUpdate {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Primary Key");
		
		Merchant m=em.find(Merchant.class, sc.nextInt());
		
		if(m!=null)
		{
			m.setPassword("Zudio@321");
			m.setGst_num("ZUDIO87654321");
			etran.commit();
		}
		else
		{
			System.err.println("No record found or Primarykey is Invalid");
		}
		sc.close();
	}
}
