package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentUpdateMain {

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
		
		Student student=new Student(); //Transient
		
		//update Record of student id=12
		Query<Student> query=session.createQuery("update Student set sname=:n where sid=:i");
		query.setParameter("n", "Dipali Gundu");
		query.setParameter("i", 12);
		int i=query.executeUpdate();
		if(i>0) {
			System.out.println("Record is updated");
		}else {
			System.out.println("Record is not updated");
		}

	}

}
