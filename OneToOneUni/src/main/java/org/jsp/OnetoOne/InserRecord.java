package org.jsp.OnetoOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InserRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		
		Person p=new Person();
		p.setName("Dhoni");
		p.setPhone(9345723087l);
		
		Pancard card=new Pancard();
		card.setPanNo("CSK87654327");
		card.setDob("7-07-1997");

		p.setCard(card);
		
		em.persist(card);
		em.persist(p);
		
		etran.commit();
		em.close();
		emf.close();
		
	}
}
