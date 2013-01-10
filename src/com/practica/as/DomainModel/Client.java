package com.practica.as.DomainModel;

import java.util.Date;

public class Client {

	private String dni;
	private String nom;
	private String tlfn;
	private Integer nombreViatges;
	
	//Funció que llença una excepció si el client ja te viatge.
	public void jaTeViatge( Date datafi){}
	
	public void creaViatge(String nom, Date dataInici, Date dataFi){}
	
}
