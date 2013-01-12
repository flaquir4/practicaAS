package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.practica.as.DataLayer.CmpKeyHabitacio;

@Entity
public class Habitacio {
	
	private List<Viatge> viatges = new ArrayList<Viatge>();
	
	private CmpKeyHabitacio habitacioPK;
	
	@Id
	public CmpKeyHabitacio getHabitacioPK() {
		return habitacioPK;
	}
	public void setHabitacioPK(CmpKeyHabitacio habitacioPK) {
		this.habitacioPK = habitacioPK;
	}
	
	public Integer disponible(Date di, Date df) {
		boolean aux = true;
		Integer nhab = null;
		for (int i=0; i < viatges.size() && aux; i++) {
			Viatge v = viatges.get(i);
			aux = v.estaDisponible(di, df);
		}
		if (aux) {
			nhab = getNumero();
		}
		return nhab;
	}
	
	public Integer getNumero() {
		return habitacioPK.getNumero();
	}
	
	public void setViatge(Viatge v) {
		viatges.add(v);
	}

}
