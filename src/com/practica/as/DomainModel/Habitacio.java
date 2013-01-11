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
		// TODO
		// boolean aux = true;
		// Integer nhab;
		// for (Viatge v : viatges && aux) {
		//    aux = v.estaDisponible(di, df);
		// }
		// if (aux) {
		//    nhab = self.numero;
		// }
		// return nhab;
		return null;
	}
	
	public Integer getNumero() {
		// TODO
		// return CmpKeyHabitacio.getNumero();
		return null;
	}
	
	public void setViatge(Viatge v) {
		// TODO
		// viatges.add(v);
	}

}
