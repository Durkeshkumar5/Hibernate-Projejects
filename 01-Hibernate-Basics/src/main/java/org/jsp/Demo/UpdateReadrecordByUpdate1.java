package org.jsp.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateReadrecordByUpdate1 {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		
		Employee e=new Employee();
		e.setId(5);
		e.setName("Durkesh");
		ses.update(e);
		tran.commit();
		
//		Employee e1=new Employee();
//		e1.setId(1);
//		e1.setName("Rocky");
//		ses.update(e1);
//		tran.commit(); 
	}
}
