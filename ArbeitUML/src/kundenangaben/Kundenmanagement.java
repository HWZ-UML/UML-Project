package kundenangaben;

import fahrzeuginformationen.Auto;

public class Kundenmanagement {

	public static void main(String[] args) {

		//Kundenmanagement km = new Kundenmanagement();
	//	Kunde neuerKunde = km.anlegenKunde("B�r");

		//if (neuerKunde.login("B�r", "1234".toCharArray())) {
		Kunde kunde = new Kunde();
		
		if (kunde.isLogin = true) {
			
			Auto auto = new Auto();
			List<Auto> gefundeneAutos = a.suche(new Model());
		}
	}

	public Kunde anlegenKunde(String benutzername) {
		return new Kunde(benutzername);
	}

}
