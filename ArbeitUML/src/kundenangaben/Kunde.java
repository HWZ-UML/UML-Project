package kundenangaben;

public class Kunde {

	public int kundennummer;
	public String benutzername;
	private double umsatz;
	private char[] passwort;

	public Kunde(String benutzername) {
		this.benutzername = benutzername;
	}

	public boolean login(String benutzername, char[] passwort) {
		if (benutzername.equals(Kundenliste.anbenutzername)) {
			; // Datenbankanlegen muss definiert werden

			return true;
		}

	}
}