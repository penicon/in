package com.penchal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class StudentDetails {
    @Id  @GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentName;

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
