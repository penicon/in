package com.penchal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentDetails {
    
	@Id
	@Column(name="sid")
	private int studentId;
	
	@Column(name="sname")
	private String studentName;
	
	@Column(name="sadd")
	private String studentAddress;
	
	@Column(name="sdob")
	private Date studentDOB;
	
	@Column(name="sfee")
	private double studentFee;
	
	
	
	
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
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}
	
	
	
	
}
