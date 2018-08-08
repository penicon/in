package com.penchal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student") 
public class StudentDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentName;	
	
@ElementCollection
	private Set<Addresses> listofAddress=new HashSet();


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Set<Addresses> getListofAddress() {
		return listofAddress;
	}


	public void setListofAddress(Set<Addresses> listofAddress) {
		this.listofAddress = listofAddress;
	}
	
	
	
	
	
	
}
