package com.penchal.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private int studentId;
	
	@Column(name="sname")
	private String studentName;

	@OneToMany
	@JoinTable(joinColumns=@JoinColumn(name="STUDENT_ID"), inverseJoinColumns=@JoinColumn(name="VEHICAL_ID"))
	private Collection<VehicalDetails>  vehicalDetails=new ArrayList<VehicalDetails>();
	

	public Collection<VehicalDetails> getVehicalDetails() {
		return vehicalDetails;
	}

	public void setVehicalDetails(Collection<VehicalDetails> vehicalDetails) {
		this.vehicalDetails = vehicalDetails;
	}

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

	
	
	
	
	
}
