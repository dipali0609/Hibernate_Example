package com.edu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity //makes class as table
//@Table(name="st_table);
public class Student {
	@Id //primary Key
	int sid;
	
	String sname;
	//@Transient //tell hibernate to to add particular column to database
	float sfees;
	//generate constructor with no arg
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	//generate constructor with arg
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}

	//generate to setter and getter method
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getSfees() {
		return sfees;
	}

	public void setSfees(float sfees) {
		this.sfees = sfees;
	}

	//generate toString method
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}


	
	
	}
