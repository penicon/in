package com.penchal.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Car")
public class FourWheeler  extends Vehical{

	private String steeringWheeler;

	public String getSteeringWheeler() {
		return steeringWheeler;
	}

	public void setSteeringWheeler(String steeringWheeler) {
		this.steeringWheeler = steeringWheeler;
	}
}
