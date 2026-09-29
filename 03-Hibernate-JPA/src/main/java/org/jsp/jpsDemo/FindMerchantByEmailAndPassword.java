package org.jsp.jpsDemo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByEmailAndPassword {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNamedQuery("findMerchantByEmailAndPassword");
		
		System.out.println("Enter the email");
		q.setParameter(1,new Scanner(System.in).nextLine());
		
		System.out.println("Enter the password");
		q.setParameter(2,new Scanner(System.in).nextLine());
		
		try {
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println(m);
		}
		catch(NoResultException e)
		{
			System.err.println("No record Found");
		}
	}
}
