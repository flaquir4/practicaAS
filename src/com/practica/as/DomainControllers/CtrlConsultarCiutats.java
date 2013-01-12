package com.practica.as.DomainControllers;

import java.util.HashSet;

import com.practica.as.DataInterface.CtrlDataFactoria;
import com.practica.as.DataLayer.CtrlCiutat;
import com.practica.as.DomainModel.Ciutat;
import com.practica.as.DomainModel.Pair;

public class CtrlConsultarCiutats {

	public HashSet<Pair> obteCiutats() {
		HashSet<Pair> resultat = new HashSet<Pair>();
		CtrlCiutat c = CtrlDataFactoria.INSTANCE.getCtrlCiutat();
		HashSet<Ciutat> ll = c.tots();
//		if (ll.isEmpty()) throw noHiHaCiutats;
		for (Ciutat l : ll) {
			String nom = l.getNom();
			float preuV = l.getPreuVol();
			resultat.add(new Pair(nom, preuV));
		}
		return resultat;
	}
	
}
