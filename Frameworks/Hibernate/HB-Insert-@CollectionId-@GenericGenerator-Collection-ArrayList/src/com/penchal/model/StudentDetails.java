package com.penchal.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="student") 
public class StudentDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentName;	
	
@ElementCollection
@JoinTable(name="USER_ADDERESS",joinColumns=@JoinColumn(name="USER_ADDERESS"))

@GenericGenerator(name ="hilo-gen" ,  strategy="" )
    @CollectionId(columns={@Column(name="ADDRESS_ID")}, generator="hilo-gen"  ,type=@Type (type="long"))

	private Collection<Addresses> listofAddress=new ArrayList();


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


	public Collection<Addresses> getListofAddress() {
		return listofAddress;
	}


	public void setListofAddress(Set<Addresses> listofAddress) {
		this.listofAddress = listofAddress;
	}
	
	
	
	
	
	
}
