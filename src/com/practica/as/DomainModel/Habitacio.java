package com.practica.as.DomainModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.practica.as.DataLayer.CmpKeyHabitacio;

@Entity
public class Habitacio {
	
	private CmpKeyHabitacio habitacioPK;
	
	@Id
	public CmpKeyHabitacio getHabitacioPK() {
		return habitacioPK;
	}
	public void setHabitacioPK(CmpKeyHabitacio habitacioPK) {
		this.habitacioPK = habitacioPK;
	}

}
