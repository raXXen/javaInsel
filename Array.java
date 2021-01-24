
public class Array {

	public static void main(String[] args) {
		//Arrays sind eine Datenstruktur (Datensammlung)
		//Der Zugriff auf die einzelnen Elemente (Daten) des Arrays passiert über den Index
		//Array[0] (<-- Beispiel)
		//Aufbau: Datentyp, Klammern, Name = new, Datentyp, [Größe des Arrays]
		
		String[] familie = new String[4]; //Die Größe des Arrays wird bei der 
										//Initialisierung festgelegt
		
		familie[0] = "Bjarne"; //Auf den ersten Platz des Arrays wurde der String Bjarne gelegt
		familie[1] = "Tjorge"; //siehe Zeile 13
		familie[2] = "Tanja"; //siehe Zeile 13
		familie[3] = "Dirk"; //siehe Zeile 13
		
		//Ausgabe des Arrays basierend auf dem Index via.  einer for-Schleife
		for (int i = 0; i < familie.length; i++) { //.lenght die Größe des (...) in
			System.out.println(familie[i]);          // diesem Fall den Index von familie.
		}
		//Kompaktes Befüllen des Arrays
		String names[] = {"Henning", "Florian", "Phillip", "Anne"};
		
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
		/*for-each-Schleife, speichert eine Kopie jedes Werts einzeln in eine Variable, 
		  auf welche man während des Durchlaufens lesend zugreifen kann.
		  Die Variable wurde hier name genannt. (Die Werte werden der Reihe nach gespeichert)
		*/
		for(String name : names) {
			System.out.println(name);
		}
		/*ein mehrdimensionales Array (eine "Tabelle an Daten", anstelle von einer
		"Reihe von Daten. 
		Ex. Ein zweidimensionales Array
		
		(0|0)(0|1)
		(1|0)(1|1)
		
		Ex. Ein eindimensionales Array
		
		(0)(1)(2)(3) etc.
		
		Es ist im Prinzip möglich unendlich viele Dimensonen zu nutzen, dies liegt allerdings
		außerhalb der menschlichen Vorstellungskraft.
		
		Auch mehrdimensionale Arrays müssen immer eine zuvor festgelegte Größe haben
		*/
		
		//ein zweidimensionales String-Array
		
		String[][] nameUndNachname = new String[5][2];
		
		nameUndNachname[0][0] = "Dieter";
		nameUndNachname[0][1] = "Heinrich";
		
		nameUndNachname[1][0] = "Hans";
		nameUndNachname[1][1] = "Meyer";
		
		nameUndNachname[2][0] = "Ludwig";
		nameUndNachname[2][1] = "Klausen";
		
		nameUndNachname[3][0] = "Hans-Peter-Ole";
		nameUndNachname[3][1] = "Kater";
		
		nameUndNachname[4][0] = "Frederik";
		nameUndNachname[4][1] = "Clausen";
		
		//Array mit zwei for-Schleifen 
		//1. for-Schleife Zeilenindex = i
		//2. for-Schleife Spaltenindex = j
		
		//Zeilenindex-Ausgabe via. einer for-Schleife
		for (int i = 0; i < nameUndNachname.length; i++) {
			//Spaltenindex-Ausgabe via. einer verschachtelten for-Schleife
			for (int j = 0; j < nameUndNachname[i].length; j++) {
				System.out.print(nameUndNachname[i][j] + " ");
			}
			//Ein Zeilenumbruch um das Array schöner auszugeben
			System.out.println();
		}
	}
}	
		
