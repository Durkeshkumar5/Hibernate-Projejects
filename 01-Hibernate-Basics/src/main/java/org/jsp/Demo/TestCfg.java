package org.jsp.Demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCfg {
	public static void main(String[] args)
	{
		Configuration conf=new Configuration();
		conf.configure();
		System.out.println("File is Loaded");
		SessionFactory sef=conf.buildSessionFactory();
		System.out.println(sef);
	}
}
