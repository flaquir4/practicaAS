package com.practica.as.DataLayer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.practica.as.DomainModel.Client;

@Embeddable
public class CmpKeyViatge implements Serializable {

	private String dni;
	private Date dataInici;
	
	public CmpKeyViatge(){}
	
	public CmpKeyViatge(String dni, Date dataInici) {
		this.dni = dni;
		this.dataInici = dataInici;
	}

	@ManyToOne(targetEntity = Client.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "dni_client")
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Date getDataInici() {
		return dataInici;
	}
	public void setDataInici(Date dataInici) {
		this.dataInici = dataInici;
	}
	
}
