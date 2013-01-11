package com.practica.as.PresentationLayer;

import java.util.Date;

public class ContractarViatgeController {
	
	// private CtrlContractarViatge ctrlContractarViatge = new CtrlContractarViatge();
	// private ContractarViatgeView vista = new ContractarViatgeView();
	
	public void contractar() {
		// TODO
		// HashSet<Pair> ciutatsPreus = ctrlContractarViatge.obteCiutats();
		// if (noHiHaCiutats) {
		//    mostraError("No hi ha ciutats");
		// } else {
		//    mostraCiutatsIPreus(ciutatsPreus);
		// }
	}
	
	public void OKenregistrarViatge(String ciutat, String dni, Date dIni, Date dFi) {
		// TODO
		// ctrlContractarViatge.enregistrarViatge(dni, dIni, dFi, ciutat);
		// if (clientNoExisteix) {
		//    mostraError("Client no existeix");
		// } else if (jaTeViatge) {
		//    mostraError("Ja té viatge");
		// } else {
		//    mostraEscullPagarOReservarHabitacio();
		// }
	}
	
	public void reservaHabitacio() {
		// TODO
		// HashSet<Pair> hotelsPreus = ctrlContractarViatge.mostraHotelsLliures();
		// if (hotelsNoLliures) {
		//    mostraError("No hi ha hotels lliures");
		// } else {
		//    mostraHotelsIPreus(hotelsPreus);
		// }
	}
	
	public void OKreservaHabitacio(String nomHotel) {
		// TODO
		// float preuTotal = ctrlContractarViatge.reservaHabitacio(nomHotel);
		// mostraPagament(preuTotal);
	}
	
	public void pagament() {
		// TODO
		// float preuVol = ctrlContractarViatge.getPreuVol();
		// mostraPagament(preuVol);
	}
	
	public void OKpagament(String numTargeta, Date dataCad) {
		// TODO
		// boolean efectuat = ctrlContractarViatge.pagament(numTargeta, dataCad);
		// if (serveiNoDisponible) {
		//    mostraError("Servei de pagament no disponible");
		// } else if (!efectuat) {
		//    mostraError("Pagament no efectuat");
		// } else {
		//    mostraFiContracte();
		// }
	}
	
	public void sortir() {
		// TODO
		// vista.tancar();
	}

}
