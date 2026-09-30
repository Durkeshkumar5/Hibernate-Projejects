package org.jsp.OnetoOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByPersonPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		
		Query q=em.createQuery("select p.card from Person p where p.phone=?1");
		
		System.out.println("Enter the PhoneNumber : ");
		q.setParameter(1,sc.nextLong());
		
		try
		{
			Pancard pc=(Pancard) q.getSingleResult();
			System.out.println(pc);
		}
		catch(NoResultException e)
		{
			System.err.println("No Record Found");
		}
		finally
		{
			sc.close();
			em.close();
			emf.close();
		}
	}
}
