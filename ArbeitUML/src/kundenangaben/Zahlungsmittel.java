package kundenangaben;

import java.util.Date;

import Enum.Kreditkartenart;

public class Zahlungsmittel {

	private Kreditkartenart kreditkartenart;
	private int kreditkartennummer;
	private Date ablaufdatum;
	
public Kreditkartenart getKreditkartenart() {
	return kreditkartenart;
}

public int getKreditkartennummer() {
	return kreditkartennummer;
}

public Date getAblaufdatum() {
	return ablaufdatum;
}

public void setKreditkartenart(Kreditkartenart kreditkartenart) {
	this.kreditkartenart = kreditkartenart;
}

public void setKreditkartennummer(int kreditkartennummer) {
	this.kreditkartennummer = kreditkartennummer;
}

public void setAblaufdatum(Date ablaufdatum) {
	this.ablaufdatum = ablaufdatum;
}

}
