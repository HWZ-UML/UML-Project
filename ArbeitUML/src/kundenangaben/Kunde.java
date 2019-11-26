package kundenangaben;

public class Kunde {

	private int kundennummer;
	private String name;
	private String benutzername;
	private char[] passwort;
	private double umsatz;
	private Login gesperrt;
	private Login login;
	private Fuehrerschein fuehrerschein;
	private Adresse adresse;
	private Zahlungsmittel zahlungsmittel;
	
	public int getKundennummer() {
		return kundennummer;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBenutzername() {
		return benutzername;
	}
	
	public char[] getPasswort() {
		return passwort;
	}
	
	public double getUmsatz() {
		return umsatz;
	}
	
	public Login getGesperrt() {
		return gesperrt;
	}
	
	public Login getLogin() {
		return login;
	}
	
	public Fuehrerschein getFuehrerschein() {
		return fuehrerschein;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public Zahlungsmittel getZahlungsmittel() {
		return zahlungsmittel;
	}
	

	public Kunde(String benutzername) {
		this.benutzername = benutzername;
	}

	public boolean login(String benutzername, char[] passwort) {
		if (benutzername.equals(Kundenliste.anbenutzername)) {
			; // Datenbankanlegen muss definiert werden

			isLogin = true;
			return isLogin;
		}
		return false;

	}
}