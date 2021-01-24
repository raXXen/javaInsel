//Eine selbsterstellte Klasse
public class Auto {
	
	//Die Attribute
	
	private String farbe;
	private int ps;
	private String marke;
	
	//Der selbsterstellte Konstruktor des Objekts Auto.
	public Auto(String farbe, int ps, String marke) {
		this.farbe = farbe;
		this.ps = ps;
		this.setMarke(marke);
	}
	
	//Die Methoden der Klasse: Auto
	
	public void ausgabe(int geschwindigkeit) {
		System.out.println();
		System.out.println("Das Auto faehrt mit " + geschwindigkeit + " km/h");
	}
	
	//Die Methode ohne Parameter, die Methode existiert doppelt, sie wurde also ueberladen.
	//Es gibt nun zwei Moeglichkeiten die ausgabe-Methode auszufuehren. Eine Methode kann 
	//beliebig oft ueberladen werden, die Signaturen der einzelnen Moeglichkeiten duerfen nur
	//nicht gleich sein, bzw. sich aehneln. Ex. Zwei varianten, aber je mit zwei int waet commit "Alle alten Datein ausgetauscht, neue Datein hinzugefuegt" 
	//falsch. 
	public void ausgabe() {
		System.out.println();
		System.out.println("Das Auto faehrt");
	}

	//Getter und Setter der Attribute
	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	public int getPs() {
		return ps;
	}


	public void setPs(int ps) {
		this.ps = ps;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}
	
}
