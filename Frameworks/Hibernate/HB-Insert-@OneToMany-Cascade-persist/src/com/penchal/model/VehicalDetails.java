package com.penchal.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehical")
public class VehicalDetails {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vno")
	private int vehicalNo;
	@Column(name="vname")
	private String vehicalName;
	
@ManyToOne
	private Collection<StudentDetails>  studentDe=new ArrayList<StudentDetails>();
	

	public Collection<StudentDetails> getStudentDe() {
		return studentDe;
	}
	public void setStudentDe(Collection<StudentDetails> studentDe) {
		this.studentDe = studentDe;
	}
	public int getVehicalNo() {
		return vehicalNo;
	}
	public void setVehicalNo(int vehicalNo) {
		this.vehicalNo = vehicalNo;
	}
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}

	
	
}
