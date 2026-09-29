package org.jsp.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
	public static void main(String[] args)
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory self=conf.buildSessionFactory();
		Session ses =self.openSession();
		Transaction tran=ses.getTransaction();	
		tran.begin();
		
		Employee e=new Employee();
		e.setName("Abi");
		e.setSalary(50000.0);
		ses.save(e);
		
		
		Employee e1=new Employee();
		e1.setName("Meghna");
		e1.setSalary(100000);
		ses.save(e1);
		
		tran.commit();
	}
}
