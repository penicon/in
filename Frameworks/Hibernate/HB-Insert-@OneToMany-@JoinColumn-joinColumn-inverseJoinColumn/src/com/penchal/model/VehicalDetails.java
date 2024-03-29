package com.penchal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehical")
public class VehicalDetails {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vno")
	private int vehicalNo;
	@Column(name="vname")
	private String vehicalName;
	
	
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
