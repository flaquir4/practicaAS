package com.practica.as.DomainModel;

import java.util.Date;
import java.util.HashSet;



public class Viatge {

	public Date dataInici;
	public Date dataFi;
	
	public Boolean estaDisponible(Date di, Date df){return true;}
	
	public void creaViatge(String nom, Date dataIni, Date dataFi){}
	
	public float reservaHabitacio( String nomH){
		
		return 0;}
	
	
	public HashSet<TupleTypeCiutat > getLlista(){return null;}
}
