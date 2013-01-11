package com.practica.as.DomainModel;

import java.util.Date;
import java.util.HashSet;



public class Viatge {

	public Date dataInici;
	public Date dataFi;
	private Ciutat ciutat;
	
	public boolean estaDisponible(Date di, Date df) {
		//TODO
		// return (self.dataInici < di && self.dataFi < di) || (df < self.dataInici && df < self.dataFi);  
		return true;
	}
	
	public void creaViatge(String nom, Date dataIni, Date dataFi) {
		// TODO
	}
	
	public float reservaHabitacio(String nomH) {
		//TODO
		// float preuH = self.ciutat.reservaHabitacio(nomH, self, self.dataInici, self.dataFi);
		// return preuH;
		return 0;
	}
	
	
	public HashSet<Pair> getLlista() {
		//TODO
		// HashSet llista = self.ciutat.getLlista(self.dataInici, self.dataFi);
		// return llista;
		return null;
	}
}
