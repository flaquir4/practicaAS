package com.practica.as.Adpters;

import java.util.Date;

public interface IAdaptadorAutoritza {

	public boolean pagament(String dni, String numT, float importTotal, Date dC, Date dAvui);
	
}
