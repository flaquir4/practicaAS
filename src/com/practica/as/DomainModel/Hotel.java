package com.practica.as.DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.practica.as.DataLayer.CmpKeyHotel;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Hotel {
	
	private CmpKeyHotel hotelPK;
	private float preu;
	private List<Habitacio> habitacions = new ArrayList<Habitacio>();

	@Id
	public CmpKeyHotel getHotelPK() {
		return hotelPK;
	}
	public void setHotelPK(CmpKeyHotel hotelPK) {
		this.hotelPK = hotelPK;
	}

	@OneToMany(targetEntity=Habitacio.class, mappedBy="habitacioPK.hotel", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Habitacio> getHabitacions() {
		return habitacions;
	}
	public void setHabitacions(List<Habitacio> habitacions) {
		this.habitacions = habitacions;
	}

	public float getPreu() {
		// TODO -- las fechas de donde saleeen??????
		// float r = self.getSuplement();
		// return (self.preu + r) * (df - di);   
		return preu;
	}
	public void setPreu(float preu) {
		this.preu = preu;
	}
	
	public String getNom() {
		return hotelPK.getNom();
	}
	
	public Integer getNumHabDisponible(Date di, Date df) {
		Integer aux = null;
		for (int i=0; i < habitacions.size() && aux != null; i++) {
			Habitacio h = habitacions.get(i);
			aux = h.disponible(di, df);
		}
		return aux;
	}
	
	public float getSuplement() {
		return 0;
	}
	
	public float reservaHabitacio(Viatge v, Date di, Date df) {
		// TODO podria ser que preuH tenga valor 0 si nunca entra en el if
		Integer numH = getNumHabDisponible(di, df);
		boolean fi = false;
		float preuH = 0;
		for (int i=0; i < habitacions.size() && fi; i++) {
			Habitacio h = habitacions.get(i);
			int numero = h.getNumero();
			fi = numH == numero;
			if (fi) {
				preuH = getPreu();
				h.setViatge(v);
			}
		}
		return preuH;
	}

}
