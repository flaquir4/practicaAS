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
		// TODO
		// float r = self.getSuplement();
		// return (self.preu + r) * (df - di); // las fechas de donde saleeen??????  
		return preu;
	}
	public void setPreu(float preu) {
		this.preu = preu;
	}
	
	public String getNom() {
		// TODO
		// return CmpKeyHotel.getNom();
		return null;
	}
	
	public Integer getNumHabDisponible(Date di, Date df) {
		// TODO
		// Integer aux;
		// for (Habitacio h : habitacions && aux == null) {
		//    aux = h.disponible(di, df);
		// }
		// return aux;
		return null;
	}
	
	public float getSuplement() {
		return 0;
	}
	
	public float reservaHabitacio(Viatge v, Date di, Date df) {
		// TODO
		// Integer numH = self.getNumHabDisponible(di, df);
		// boolean fi = false;
		// for (Habitacio h : habitacions && !fi) {
		//    int numero = h.getNumero();
		//    fi = numH == numero;
		//    if (fi) {
		//       float preuH = self.getPreu();
		//       h.setViatge(v);
		//    }
		// }
		// return preuH; // ojooooo, que igual no es defineix preuH!!!!
		return 0;
	}

}
