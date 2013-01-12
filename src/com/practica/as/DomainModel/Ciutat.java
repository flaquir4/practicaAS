package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Ciutat {

	private String nom;
	private String descripcio;
	private float preuVol;
	private List<Hotel> hotels = new ArrayList<Hotel>();
	
	public HashSet<Pair> getLlista(Date dataInici, Date dataFi){
		HashSet<Pair> llista = new HashSet<Pair>();
		for (Hotel h : hotels) {
			Integer r = h.getNumHabDisponible(dataInici, dataFi);
			if (r != null) {
				String nom = h.getNom();
				float preu = h.getPreu();
				llista.add(new Pair(nom, preu));
			}
		}
		return llista;
	}
	@Id
	public String getNom(){
		return nom;
	}
	
	public float getPreuVol() {
		return preuVol;
	}
	
	
	public float reservaHabitacio(String nomH, Viatge v, Date dataInici, Date dataFi){
		// TODO - podria passar que preuH no tingui valor en acabar el bucle... // no porque si no hubiese saltado la excepcion hotels no llliures
		boolean fi = false;
		float preuH = 0;
		for (int i=0; i < hotels.size() && !fi; i++) {
			Hotel h = hotels.get(i);
			String nom = h.getNom();
			fi = nom == nomH;
			if (fi) {
				preuH = h.reservaHabitacio(v, dataInici, dataFi);
			}
		}
		return preuH;
	}

}
