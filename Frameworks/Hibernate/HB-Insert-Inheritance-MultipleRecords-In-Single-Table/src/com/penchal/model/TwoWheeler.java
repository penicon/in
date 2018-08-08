package com.penchal.model;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehical {

	private String streeringHandler;

	public String getStreeringHandler() {
		return streeringHandler;
	}

	public void setStreeringHandler(String streeringHandler) {
		this.streeringHandler = streeringHandler;
	}


	
}
