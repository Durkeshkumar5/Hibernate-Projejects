package org.jsp.jpsDemo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCFG {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		System.out.println(emf);
		
	}
	
}
