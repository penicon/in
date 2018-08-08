package com.penchal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentDetails {
    
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private int studentId;
	
	@Column(name="sname")
	private String studentName;

	@OneToOne
	@JoinColumn(name="vehical_name")
	private VehicalDetails  vehicalDetails;
	
	public VehicalDetails getVehicalDetails() {
		return vehicalDetails;
	}

	public void setVehicalDetails(VehicalDetails vehicalDetails) {
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
