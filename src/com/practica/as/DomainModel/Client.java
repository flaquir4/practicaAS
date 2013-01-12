package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import Excepcions.jaTeViatge;
@Entity
public class Client {
	private String dni;
	private String nom;
	private String tlfn;
	private Integer nombreViatges;
	private List<Viatge> viatges = new ArrayList<Viatge>();
	
	@Id
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}

	public Integer getNombreViatges() {
		return nombreViatges;
	}

	public void setNombreViatges(Integer nombreViatges) {
		this.nombreViatges = nombreViatges;
	}

	public List<Viatge> getViatges() {
		return viatges;
	}

	public void setViatges(List<Viatge> viatges) {
		this.viatges = viatges;
	}


	//public void jaTeViatge borrada por corrección de la profe


	public void creaViatge(String nom, Date dataInici, Date dataFi) throws jaTeViatge{

		for (Viatge v : viatges) {
			boolean b = v.estaDisponible(dataInici, dataFi);
			if (!b)throw new jaTeViatge();
		}
	}


	//TODO - por que se le pasa el dni ?????? Si en viatge no hay dni...
	// Viatge v = new Viatge(dni, nom, dataInici, dataFi);
	// nombreViatges++;
	// viatges.add(v);
}

