package com.practica.as.DomainModel;

public class TupleTypeCiutat {
	private String nom;
	private float preu;
	
	public TupleTypeCiutat(String n, float p){
		nom = n;
		preu = p;
	}
	
	public void setNom(String n){
		nom = n;
	}
	
	public void setPreu(float p){
		preu = p;
	}
	
	public String getNom() {
		return nom;
	}
	
	public float getPreu(){
		return preu;
	}
}
