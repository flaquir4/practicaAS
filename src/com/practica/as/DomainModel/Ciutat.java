package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Ciutat {

	private String nom;
	private String descripcio;
	private float preuVol;
	private List<Hotel> hotels = new ArrayList<Hotel>();
	
	public HashSet<Pair> getLlista(Date dataInici, Date dataFi){
		// TODO
		// HashSet<Pair> llista = new HashSet<Pair>();
		// for (Hotel h : hotels) {
		//    Integer r = h.getNumHabDisponible(dataInici, dataFi);
		//    if (r != null) {
		//        String nom = h.getNom();
		//        float preu = h.getPreu();
		//        llista.add(new Pair(nom, preu));
		//    }
		// }
		// return llista;
		return null;
	}
	
	public String getNom(){
		return nom;
	}
	
	public float getPreuVol() {
		return preuVol;
	}
	
	
	public float reservaHabitacio(String nomH, Viatge v, Date dataInici, Date DataFi){
		// TODO
		// boolean fi = false;
		// for (Hotel h : hotels && !fi) {
		//    String nom = h.getNom();
		//    fi = nom == nomH;
		//    if (fi) {
		//       float preuH = h.reservaHabitacio(v, dataInici, dataFi);
		//    }
		// }
		// return preuH; // cal vigilar, i si no es retorna preuH????????
		return 0;
	}

}
