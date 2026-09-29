package org.jsp.jpsDemo;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdaterecordByMerge {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		
		Merchant m=new Merchant();
		m.setId(10);
		m.setEmail("firstcry@gmail.com");
		m.setPhone(6381252159l);
		m.setPassword("FC@234");
		
		em.merge(m);
		etran.commit();
		
	}
}
