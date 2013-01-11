package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

	private String dni;
	private String nom;
	private String tlfn;
	private Integer nombreViatges;
	private List<Viatge> viatges = new ArrayList<Viatge>();
	
	//Funció que llença una excepció si el client ja te viatge.
	public void jaTeViatge(Date di, Date df){
		//TODO
		// for (Viatge v : viatges) {
		//    boolean b = v.estaDisponible(di, df);
		//    if (!b) activa jaTeViatge;
		// }
	}
	
	public void creaViatge(String nom, Date dataInici, Date dataFi){
		//TODO
		// crea Viatge(self.dni, nom, dataInici, dataFi):v;
		// self.nombreViatges++;
		// viatges.add(v);
	}
	
}
