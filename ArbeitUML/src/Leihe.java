import java.sql.Time;
import java.util.Date;

import fahrzeuginformationen.Auto;
import fahrzeuginformationen.Preis;
import kundenangaben.Kunde;

public class Leihe {

	public Auftrag auftragsnummer;
	public Auto fahrzeugnummer;
	public Kunde kundennummer;
	public Date datumvon;
	public Time zeitvon;
	public Date datumbis;
	public Time zeitbis;
	public String startpunkt;
	public String zielort;
	public Preis preisklasse;
	public String einsatzgebiet;
	
}
