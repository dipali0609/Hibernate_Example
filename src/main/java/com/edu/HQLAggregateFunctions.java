package com.edu;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLAggregateFunctions {

	public static void main(String[] args) {
		//step 1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);
		
		//step 2
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//Step 3
		Session session=sessionFactory.openSession();
		//step
		Transaction transaction =session.beginTransaction();
		//max, min, avg,count
		//Query<Student>student=session.createQuery("select sum(sfees) from Student");
		//Query<Student>student=session.createQuery("select max(sfees) from Student");
		//Query<Student>student=session.createQuery("select min(sfees) from Student");
		Query<Student>student=session.createQuery("select count(sid) from Student");
		List<Student>list=student.list();
		System.out.println(list.get(0));
	
	}

}
