
public class Methoden {

	public static void main(String[] args) {
		//eine Methode ist vorprogrammierter Code den man beliebig oft aufrufen kann.
		//Stichwort: Wiederverwendbar
		
		//Das Aufrufen der eigenen Methode
		tueEtwas();
		
		/*
		 * Das nutzen einer Methode Methodenname(Parameter);
		 */
		addiere(10, 4);
		
		
		//Ausgabe des zurückgegebenen Ergebnisses
		System.out.println(addiereMitErgebniss(10, 14));
		
		//Speichern des zurückgegebenen Ergebnisses
		int gespeichertesErgebniss = addiereMitErgebniss(10, 14);
		System.out.println(gespeichertesErgebniss);

	}
	//eine selbsterstellte Methode ohne Rückgabewert
	public static void tueEtwas() {
		int x = 10;
		int y = 20;
		int result = x + y;
		System.out.println(result);
	}
	//Eine Methode mit Parametern
	public static void addiere(int x, int y) {
		int ergebniss = x + y;
		System.out.println(x + " + " + y + " = " + ergebniss);
	}
	public static int addiereMitErgebniss(int x, int y) {
		int ergebniss = x + y;
		return ergebniss;
		//oder return x + y; das wäre dann noch verkürzter 
	}
}

