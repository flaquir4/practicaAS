package com.practica.as.DomainModel;

import javax.persistence.Entity;

@Entity
public class HotelSuperior extends Hotel {
	
	private float recarrec;

	public float getRecarrec() {
		return recarrec;
	}
	public void setRecarrec(float recarrec) {
		this.recarrec = recarrec;
	}
	
	public float getSuplement() {
		// TODO
		// return recarrec;
		return 0;
	}

}
