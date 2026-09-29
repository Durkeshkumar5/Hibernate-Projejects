package org.jsp.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateReadrecordBySaveOrUpdate {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		
		Employee e=new Employee();
		e.setId(7);
		e.setName("Durkesh");
		e.setSalary(50000);
		ses.saveOrUpdate(e);
		tran.commit();
	}
}
