package com.practica.as.DomainControllers;

import java.util.Date;
import java.util.HashSet;

import Excepcions.hotelsNoLliures;
import Excepcions.jaTeViatge;

import com.practica.as.Adpters.AdaptadorAutoritza;
import com.practica.as.Adpters.Factoria;
import com.practica.as.DataInterface.CtrlDataFactoria;
import com.practica.as.DataLayer.CtrlClient;
import com.practica.as.DomainModel.Client;
import com.practica.as.DomainModel.Pair;

public class CtrlContractarViatge {

	private String dni;
	private String nom;
	private Date dataInici;
	private Date dataFi;
	private float preuVol;
	private float preuH;
	private CtrlReservarHabitacio ctrlReservarHabitacio;
	private CtrlConsultarCiutats ctrlConsultarCiutats;
	
	public HashSet<Pair> obteCiutats(){
		ctrlConsultarCiutats = new CtrlConsultarCiutats();
		HashSet<Pair> ciutats = ctrlConsultarCiutats.obteCiutats();
		return ciutats;
	}
	
	public void enregistraViatge(String dni, Date dataInici, Date dataFi, String nom) throws jaTeViatge {
		CtrlClient cc = CtrlDataFactoria.INSTANCE.getCtrlClient();
		Client c = cc.get(dni);
		c.creaViatge(nom, dataInici, dataFi);
		this.dni = dni;
		this.dataInici = dataInici;
		this.dataFi = dataFi;
		this.nom = nom;
	}
	
	public HashSet<Pair> mostraHotelsLliures() throws hotelsNoLliures {
		ctrlReservarHabitacio = new CtrlReservarHabitacio(dni, dataInici);
		HashSet<Pair> llista = ctrlReservarHabitacio.mostraHotelsLliures();
		return llista;
	}
	
	public float reservaHabitacio(String nomH) {
		ctrlReservarHabitacio = new CtrlReservarHabitacio();
		float preu = ctrlReservarHabitacio.reservaHabitacio(nomH);
		this.preuH = preu;
		
		// Ho he canviat per a que retorni el import total
		// retutn preu;
		return preuH + preuVol;
	}
	
	public boolean pagament(String numTarg, Date dC) {
		Date dAvui = new Date();
		float importTotal = this.preuVol + this.preuH;
		AdaptadorAutoritza aa = Factoria.INSTANCE.getAdaptadorAutoritza();
		boolean b = aa.pagament(dni, numTarg, importTotal, dC, dAvui);
		return b;
	}
	
	public float getPreuVol() {
		return preuVol;
	}
	
}
