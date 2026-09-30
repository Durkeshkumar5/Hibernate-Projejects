package org.jsp.OnetoOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPancard_NumberAndDOB {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();

		Query q=em.createQuery("Select p from Person p where p.card.panNo=?1 and p.card.dob=?2");
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the PanNumber : ");
		q.setParameter(1,sc.nextLine());
		
		System.out.println("Enter the D.O.B : ");
		q.setParameter(2,sc.nextLine());
		try
		{
			Person ps=(Person) q.getSingleResult();
			System.out.println(ps);
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
