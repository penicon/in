package com.penchal.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student")
public class StudentDetails {
    
	@Id
	@Column(name="sid")
	private int studentId;
	
	@Column(name="sname")
	private String studentName;
	
	@Embedded

	private StudentAddress  studentAddress;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="studentDno", column=@Column(name="Home_Dno")),
	@AttributeOverride(name="studentHomeAddress", column=@Column(name="Home_Address")),
	@AttributeOverride(name="studentLane", column=@Column(name="Home_Lane")),
	@AttributeOverride(name="studentState", column=@Column(name="Home_State")),
	@AttributeOverride(name="studentZip", column=@Column(name="Home_Zip"))
	})
	private StudentAddress studentOfficeAddress;
	
	
	public StudentAddress getStudentOfficeAddress() {
		return studentOfficeAddress;
	}
	public void setStudentOfficeAddress(StudentAddress studentOfficeAddress) {
		this.studentOfficeAddress = studentOfficeAddress;
	}
	@Temporal(TemporalType.DATE)
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
	
	
	public StudentAddress getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(StudentAddress studentAddress) {
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
