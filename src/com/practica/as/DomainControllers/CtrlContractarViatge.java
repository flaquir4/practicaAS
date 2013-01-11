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
	private CtrlReservarHabitacio ctrlReservarHabitacio;
	
	public HashSet<Pair> obteCiutats(){
		// TODO
		// crea CtrlConsultarCiutats
		// crida CtrlConsultarCiutats::obteCiutats():ciutats
		// return ciutats
		return null;
	}
	
	public void enregistraViatge(String dni, Date dataInici, Date dataFi, String nom) {
		//TODO
		// CtrlClient cc = CtrlDataFactoria.INSTANCE.getCtrlClient();
		// Client c = cc.get(dni);
		// c.jaTeViatge(dataInici, dataFi);
		// c.creaViatge(nom, dataInici, dataFi);
		// self.dni = dni;
		// self.dataInici = dataInici;
		// self.dataFi = dataFi;
		// self.nom = nom;
	}
	
	public HashSet<Pair> mostraHotelsLliures() {
		//TODO
		// crea CtrlReservarHabitacio(self.dni, self.dataInici)
		// crida CtrlReservarHabitacio::mostraHotelsLliures():llista
		// return llista
		return null;
	}
	
	public float reservaHabitacio(String nomH) {
		// TODO
		// crea CtrlReservarHabitacio()
		// crida CtrlReservarHabitacio::reservaHabitacio(nomH):preu
		// self.preuH = preu
		// return preu
		return 0;
	}
	
	public boolean pagament(String numTarg, Date dC) {
		// TODO
		// Date dAvui = System.currentDate();
		// float importTotal = self.preuVol + self.preuH;
		// IAdaptadorAutoritza aa = Factoria.INSTANCE.getAdaptadorAutoritza();
		// boolean b = aa.pagament(self.dni, numT, importTotal, dC, dAvui);
		// return b;
		return true;
	}
	
	public float getPreuVol() {
		return preuVol;
	}
	
}
