package com.practica.as.DomainControllers;

import java.util.Date;
import java.util.HashSet;

import com.practica.as.DomainModel.Pair;

public class CtrlContractarViatge {

	private String dni;
	private String nom;
	private Date dataInici;
	private Date dataFi;
	private float preuVol;
	private float preuH;
	
	public HashSet<Pair> obteCiutats(){
		// TODO
		return null;
	}
	
	public void enregistraViatge(String dni, Date dataInici, Date dataFi, String nom) {
		//TODO
	}
	
	public HashSet<Pair> mostraHotelsLliures() {
		//TODO
		return null;
	}
	
	public float reservaHabitacio(String nomH) {
		// TODO
		return 0;
	}
	
	public boolean pagament(String numTarg, Date dC) {
		// TODO
		return true;
	}
	
}
