package com.practica.as.DomainModel;

import javax.persistence.Entity;

@Entity
public class HotelLowCost extends Hotel {
	
	private float descompte;

	public float getDescompte() {
		return descompte;
	}
	public void setDescompte(float descompte) {
		this.descompte = descompte;
	}
	
	public float getSuplement() {
		return descompte*(-1);
	}

}
