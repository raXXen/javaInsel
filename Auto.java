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
		System.out.println("Das Auto fährt mit " + geschwindigkeit + " km/h");
	}
	
	//Die Methode ohne Parameter, die Methode existiert doppelt, sie wurde also überladen.
	//Es gibt nun zwei Möglichkeiten die ausgabe-Methode auszuführen. Eine Methode kann 
	//beliebig oft überladen werden, die Signaturen der einzelnen Möglichkeiten dürfen nur
	//nicht gleich sein, bzw. sich ähneln. Ex. Zwei varianten, aber je mit zwei int wäre 
	//falsch. 
	public void ausgabe() {
		System.out.println();
		System.out.println("Das Auto fährt");
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
