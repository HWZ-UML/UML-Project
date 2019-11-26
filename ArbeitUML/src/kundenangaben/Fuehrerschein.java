package kundenangaben;
import java.util.Date;

public class Fuehrerschein {

	private int nummer;
	private Date ablaufdatum;
	
public int getNummer() {
	return nummer;
}

public Date getAblaufdatum() {
	return ablaufdatum;
}

public void setNummer(int nummer) {
	this.nummer = nummer;
}

public void setAblaufdatum(Date ablaufdatum) {
	this.ablaufdatum = ablaufdatum;
}

}
