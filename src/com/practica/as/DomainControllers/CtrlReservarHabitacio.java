package com.practica.as.DomainControllers;

import java.util.Date;
import java.util.HashSet;

import Excepcions.hotelsNoLliures;

import com.practica.as.DataInterface.CtrlDataFactoria;
import com.practica.as.DataLayer.CtrlViatge;
import com.practica.as.DomainModel.Pair;
import com.practica.as.DomainModel.Viatge;

public class CtrlReservarHabitacio {

	private String dni;
	private Date dataInici;
	
	public CtrlReservarHabitacio() {
		
	}
	
	public CtrlReservarHabitacio(String dni, Date dataInici) {
		this.dni = dni;
		this.dataInici = dataInici;
	}
	
	public HashSet<Pair> mostraHotelsLliures() throws hotelsNoLliures {
		CtrlViatge cv = CtrlDataFactoria.INSTANCE.getCtrlViatge();
		Viatge v = cv.get(dni, dataInici);
		HashSet<Pair> llista = v.getLlista();
		if (llista.isEmpty())  throw new hotelsNoLliures();
		return llista;
	}
	
	public float reservaHabitacio(String nomH) {
		// TODO
		CtrlViatge cv = CtrlDataFactoria.INSTANCE.getCtrlViatge();
		Viatge v = cv.get(dni, dataInici);
		float preuH = v.reservaHabitacio(nomH);
// Ho he canviat per a que retorni nomes el preuH, que aqui el preuVol no pinta na...
		// self.preuH = preuH; // esta clase no tiene self.preuH!!!!
		// float resultat = preuH + PreuVol // esta clase no tiene preuVol!!!!!
		// return resultat;
		return preuH;
	}
	
}
