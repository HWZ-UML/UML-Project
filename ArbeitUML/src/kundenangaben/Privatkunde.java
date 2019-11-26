package kundenangaben;
import java.util.Date;

public class Privatkunde extends Kunde{

	private String vorname;
	private Date geburtsdatum;
	
	public String getVorname() {
		return vorname;
	}
	
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	
}

