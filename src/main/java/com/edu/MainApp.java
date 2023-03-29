package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

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
	//session.save(student); //persistent state
	student.setSid(13);
	student.setSname("Ruchita");
	student.setSfees(9765.23f);
	session.save(student); 
	
	Student student1=new Student(); //Transient
	//session.save(student); //persistent state
	student1.setSid(14);
	student1.setSname("George");
	student1.setSfees(9765.23f);
	session.save(student1); 
	
	Student student2=new Student(); //Transient
	//session.save(student); //persistent state
	student2.setSid(15);
	student2.setSname("Ravi");
	student2.setSfees(6734);
	session.save(student2); 
	transaction.commit();
	System.out.println(student2);
	
	//session.evict(student); //detach
	//student.setSfees(9876);
	
	session.close();
	
   }

}
