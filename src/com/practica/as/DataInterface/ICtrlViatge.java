package com.practica.as.DataInterface;

import java.util.Date;

import com.practica.as.DomainModel.Viatge;

public interface ICtrlViatge {
	
	public Viatge get(String dni, Date dataInici);
}
