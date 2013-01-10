package com.practica.as.DomainModel;

import java.util.Date;
import java.util.HashSet;

public class Ciutat {

	private String nom;
	private String descripcio;
	private float preuVol;
	
	public HashSet<Pair > getLlista(Date dataInici, Date dataFi){
		//TODO
		return null;
	}
	
	public String getNom(){
		return nom;
	}
	
	public float getPreuVol() {
		return preuVol;
	}
	
	
	public float reservaHabitacio(String nomH, Viatge v, Date dataInici, Date DataFi){
		//TODO
		return 0;
	}

}
