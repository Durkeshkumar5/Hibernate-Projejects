package org.jsp.OnetoOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByPanNoAndDOB {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		
		Query q=em.createNativeQuery("select * from Pancard where panNo=? and dob=?",Pancard.class);
		
		System.out.println("Enter the PanNumber : ");
		q.setParameter(1,sc.nextLine());
		
		System.out.println("Enter the D.O.B");
		q.setParameter(2,sc.nextLine());
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
