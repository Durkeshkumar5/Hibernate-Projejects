package org.jsp.OnetoOne;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPhoneNo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		
		Query q=em.createQuery("select p from Person p where p.phone=?1");
		System.out.println("Enter the Person by PhoneNumber :");
		q.setParameter(1,sc.nextLong());
		List<Person> list = q.getResultList();
		
		if(!list.isEmpty())
		{
			Iterator<Person> i=list.iterator();
			while(i.hasNext())
			{
				Person p1=i.next();
				System.out.println(p1);
			}
		}
		else
		{
			System.err.println("No record found");
		}
		
		sc.close();
		em.close();
		emf.close();
		
	}
}
