package com.practica.as.DomainModel;

import java.util.Date;
import java.util.HashSet;



public class Viatge {

	public Date dataInici;
	public Date dataFi;
	private Ciutat ciutat;
	private Client client;
	
	public boolean estaDisponible(Date di, Date df) {
		return dataInici.after(df) && dataFi.before(di); 
		// return (this.dataInici < di && this.dataFi < di) || (df < this.dataInici && df < this.dataFi);
}
	
	public void creaViatge(String nom, Date dataIni, Date dataFi) {
		// TODO faltaaaaa no esta en los diagramas de secuenciaa!!!!!!!!
	}
	
	public float reservaHabitacio(String nomH) {
		float preuH = ciutat.reservaHabitacio(nomH, this, dataInici, dataFi);
		return preuH;
	}
	
	
	public HashSet<Pair> getLlista() {
		HashSet<Pair> llista = ciutat.getLlista(dataInici, dataFi);
		return llista;
	}
}
