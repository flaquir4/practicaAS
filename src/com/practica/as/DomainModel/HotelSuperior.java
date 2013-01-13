package com.practica.as.DomainModel;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class HotelSuperior extends Hotel {
	
	private float recarrec;

	public float getRecarrec() {
		return recarrec;
	}
	public void setRecarrec(float recarrec) {
		this.recarrec = recarrec;
	}
	
	@Transient
	public float getSuplement() {
		return recarrec;
	}

}
