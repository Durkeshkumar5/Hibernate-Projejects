package org.jsp.jpsDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		Merchant m=new Merchant();
		
		m.setName("Max");
		m.setGst_num("MAX12345123");
		m.setEmail("max555@gmail.com");
		m.setPhone(9345723087l);
		m.setPassword("MAX@123");
		
		em.persist(m);
		etran.commit();
	}
}
