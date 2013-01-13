package com.practica.as.PresentationLayer;

import java.util.HashSet;

import com.practica.as.DomainModel.Pair;

public class ContractarViatgeView {
	
	private ContractarViatgeController controlador;
	
	public void mostraIniciarContractar() {
		// aquesta funcio es nova, es per mostrar la pantalla inicial del cas d'us
		// es la que es crida des de la creadora del controlador de presentacio o des del main
		// TODO
		// Dialeg: Voleu contractar viatge?
		// Boto:Començar -> controlador.contractar();
		// Boto: Cancel·lar -> controlaor.sortir();
	}
	
	public void mostraCiutatsIPreus(HashSet<Pair> ciutatPreus) {
		// TODO
		// Llistat: ciutats i preus (cal seleccionar una fila)
		// Text Input: dni (cal posar-lo)
		// Date Input: data inici (cal posar-la)
		// Date input: data fi (cal posar-la)
		// Boto: Començar -> controlador.OKenregistrarViatge();
		// Boto: Cancel·lar -> controlador.sortir();
	}
	
	public void mostraEscullPagarOReservarHabitacio() {
		// TODO
		// Dialeg: El viatge s'ha enregistrat. Voleu reservar un hotel?
		// Boto: Reservar habitacio -> controlador.reservaHabitacio();
		// Boto: Continuar -> controlador.pagament();
		// Boto: Cancel·lar -> controlador.sortir();
	}
	
	public void mostraHotelsIPreus(HashSet<Pair> hotelsPreus) {
		// TODO
		// Llistat: hotels i preus (Cal seleccionar una fila)
		// Boto: Continuar -> controlador.OKreservaHabitacio();
		// Boto: Cancel·lar -> controlador.sortir();
	}
	
	public void mostraPagament(float importTotal) {
		// TODO
		// Label: import total
		// Text input: numero targeta (cal posar-lo)
		// Text input: data caducitat (cal posar-la)
		// Boto: Continuar -> controlador.OKpagament();
		// Boto: Cancel·lar -> controlador.sortir();
	}
	
	public void mostraFiContracte() {
		// TODO
		// Text: El pagament s'ha fet amb exit
		// Boto: Acabar -> controlador.sortir();
	}
	
	public void mostraError(String error) {
		// TODO
		// Dialeg: mostra "error"
		// Boto: OK -> tanca dialeg i segons quin, sortir o mostra vista anterior:
		// 	Si error = "Client no existeix" -> controlador.contractar() o this.mostraCiutatsIPreus()
		// 	Si error = "Ja té viatge" -> controlador.contractar() o this.mostraCiutatsIPreus()
		// 	Si error = "Hotels no lliures" -> controlador.pagament() o this.mostraPagament()
		// 	Si no -> controlador.sortir()
	}
	
	public void tancar() {
		// TODO
		// self.close
	}

}
