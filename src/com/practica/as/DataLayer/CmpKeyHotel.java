package com.practica.as.DataLayer;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CmpKeyHotel implements Serializable{

	private String ciutat;
	private String nom;
	
	public CmpKeyHotel(){}
	
	public CmpKeyHotel(String ciutat, String nom) {
		this.ciutat = ciutat;
		this.nom = nom;
	}

	public String getCiutat() {
		return ciutat;
	}
	public void setCiutat(String ciutat) {
		this.ciutat = ciutat;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
