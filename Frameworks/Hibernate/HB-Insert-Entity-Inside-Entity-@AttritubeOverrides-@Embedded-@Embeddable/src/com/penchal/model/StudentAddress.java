package com.penchal.model;

import javax.persistence.Embeddable;

@Embeddable
public class StudentAddress {

	private int studentDno;
	private String studentHomeAddress;
	private String studentLane;
	private String studentState;
	private int zipCode;
	
	
	
	public int getStudentDno() {
		return studentDno;
	}
	public void setStudentDno(int studentDno) {
		this.studentDno = studentDno;
	}
	public String getStudentHomeAddress() {
		return studentHomeAddress;
	}
	public void setStudentHomeAddress(String studentHomeAddress) {
		this.studentHomeAddress = studentHomeAddress;
	}
	public String getStudentLane() {
		return studentLane;
	}
	public void setStudentLane(String studentLane) {
		this.studentLane = studentLane;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	
}
