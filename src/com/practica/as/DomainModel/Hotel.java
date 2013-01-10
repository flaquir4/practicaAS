package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.practica.as.DataLayer.CmpKeyHotel;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Hotel {
	
	private CmpKeyHotel hotelPK;
	private float preu;
	private List<Habitacio> habitacions = new ArrayList<Habitacio>();

	@Id
	public CmpKeyHotel getHotelPK() {
		return hotelPK;
	}
	public void setHotelPK(CmpKeyHotel hotelPK) {
		this.hotelPK = hotelPK;
	}

	@OneToMany(targetEntity=Habitacio.class, mappedBy="habitacioPK.hotel", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Habitacio> getHabitacions() {
		return habitacions;
	}
	public void setHabitacions(List<Habitacio> habitacions) {
		this.habitacions = habitacions;
	}

	public float getPreu() {
		return preu;
	}
	public void setPreu(float preu) {
		this.preu = preu;
	}
	

}
