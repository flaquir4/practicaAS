package com.practica.as.DomainModel;

import java.util.Date;
import java.util.HashSet;

import javax.persistence.ManyToOne;



public class Viatge {

	public Date dataInici;
	public Date dataFi;
	private Ciutat ciutat;
	private String dni;

	public Date getDataInici() {
		return dataInici;
	}

	public void setDataInici(Date dataInici) {
		this.dataInici = dataInici;
	}

	public Date getDataFi() {
		return dataFi;
	}

	public void setDataFi(Date dataFi) {
		this.dataFi = dataFi;
	}

	public Ciutat getCiutat() {
		return ciutat;
	}

	public void setCiutat(Ciutat ciutat) {
		this.ciutat = ciutat;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public boolean estaDisponible(Date di, Date df) {
		return dataInici.after(df) && dataFi.before(di); 
	}

	public  Viatge(String dni, Ciutat ciutat, Date dataIni, Date dataFi) {
		this.dataFi=dataFi;
		this.dataInici=dataIni;
		this.dni=dni;
		this.ciutat=ciutat;

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
