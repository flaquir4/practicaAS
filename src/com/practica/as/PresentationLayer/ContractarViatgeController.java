package com.practica.as.PresentationLayer;

import java.util.Date;
import java.util.HashSet;

import com.practica.as.DomainControllers.CtrlContractarViatge;
import com.practica.as.DomainModel.Pair;

public class ContractarViatgeController {
	
	private CtrlContractarViatge ctrlContractarViatge = new CtrlContractarViatge();
	private ContractarViatgeView vista = new ContractarViatgeView();
	
	public void contractar() {
		// TODO - falta la transmision de las excepciones
//		HashSet<Pair> ciutatsPreus = ctrlContractarViatge.obteCiutats();
//		if (noHiHaCiutats) {
//			vista.mostraError("No hi ha ciutats");
//		} else {
//			vista.mostraCiutatsIPreus(ciutatsPreus);
//		}
	}
	
	public void OKenregistrarViatge(String ciutat, String dni, Date dIni, Date dFi) {
		// TODO - falta la transmision de las excepciones
//		ctrlContractarViatge.enregistraViatge(dni, dIni, dFi, ciutat);
//		if (clientNoExisteix) {
//			vista.mostraError("Client no existeix");
//		} else if (jaTeViatge) {
//			vista.mostraError("Ja té viatge");
//		} else {
//			vista.mostraEscullPagarOReservarHabitacio();
//		}
	}
	
	public void reservaHabitacio() {
		// TODO - falta la transmision de las excepciones
//		HashSet<Pair> hotelsPreus = ctrlContractarViatge.mostraHotelsLliures();
//		if (hotelsNoLliures) {
//			vista.mostraError("No hi ha hotels lliures");
//		} else {
//			vista.mostraHotelsIPreus(hotelsPreus);
//		}
	}
	
	public void OKreservaHabitacio(String nomHotel) {
		float preuTotal = ctrlContractarViatge.reservaHabitacio(nomHotel);
		vista.mostraPagament(preuTotal);
	}
	
	public void pagament() {
		float preuVol = ctrlContractarViatge.getPreuVol();
		vista.mostraPagament(preuVol);
	}
	
	public void OKpagament(String numTargeta, Date dataCad) {
		// TODO - falta la transmision de las excepciones
//		boolean efectuat = ctrlContractarViatge.pagament(numTargeta, dataCad);
//		if (serveiNoDisponible) {
//			vista.mostraError("Servei de pagament no disponible");
//		} else if (!efectuat) {
//			vista.mostraError("Pagament no efectuat");
//		} else {
//			vista.mostraFiContracte();
//		}
	}
	
	public void sortir() {
		vista.tancar();
	}

}
