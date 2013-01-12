package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Excepcions.jaTeViatge;

public class Client {

	private String dni;
	private String nom;
	private String tlfn;
	private Integer nombreViatges;
	private List<Viatge> viatges = new ArrayList<Viatge>();

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

