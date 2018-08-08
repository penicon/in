package com.penchal.model;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehical {

	
	 private String steeringHandler;

	public String getSteeringHandler() {
		return steeringHandler;
	}

	public void setSteeringHandler(String steeringHandler) {
		this.steeringHandler = steeringHandler;
	}
}
