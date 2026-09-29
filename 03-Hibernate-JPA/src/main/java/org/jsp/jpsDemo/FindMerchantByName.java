package org.jsp.jpsDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByName {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m from Merchant m where m.name=?1");
		System.out.println("Enter the name");
		
		q.setParameter(1,new Scanner(System.in).nextLine());
		List<Merchant> m1=q.getResultList();
		
		if(!m1.isEmpty())
		{
			Iterator<Merchant> i=m1.iterator();
			while(i.hasNext())
			{
				Merchant m=i.next();
				System.out.println(m);
			}
		}
		else
		{
			System.err.println("No record found");
		}
	}
}
