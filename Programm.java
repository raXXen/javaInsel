
public class Programm {

	public static void main(String[] args) {
		System.out.println("Hallo Tjorge");
		
		int age = 27;
		
		String ausgabe = "Hallo lieber Nutzer";
		System.out.println(ausgabe);
		
		if(age >= 18) {
			System.out.println("du bist noch minderjährig");
		}
		
		int number = 2;
		
		switch(number) {
			case 1: System.out.println("Der Wert ist 1"); break;
			case 2: System.out.println("Der Wert ist 2"); break;
			case 3: System.out.println("Der Wert ist 3"); break;
			default: System.out.println("Der Wert stimmt nicht mit den eingetragenen Daten überein");
		
		}
	
		while(number <= 5) {
		
			System.out.println("Die While-Schleife addierte zu number einz hinzu, number beträgt nun: " + number);
			number++;
		}
		
		//die do-While-Schleife
		do {
			System.out.println("Die While-Schleife addierte zu number einz hinzu, number beträgt nun: " + number);
			number++;
	}
	while(number <= 5);
	
	for (int i = 0; i < 10; i++) {
		System.out.print(i + " ");
		}
		
	for (int j = 5; j < 10; j++) {
		int k = j * 2;			
		System.out.print(k + " ");
	}
	
	
	//Das Erzeugen eines eigen erstellten Objekts aus der eigens definierten Klasse: Auto
	Auto auto1 = new Auto("Blau", 100, "Audi"); //Die im Konstruktor angegebenen Attribute
	
	//Das aufrufen einer Methode in einer eigens definierten Klasse mit einem Objekt
	//Name der Variable mit dem Objekt.Methode();
	auto1.ausgabe(30);
	auto1.setFarbe("Grün");
	
	//Ausgeben eines Attribut eines Objekts via. eines Setters
	System.out.println(auto1.getFarbe());
	System.out.println(auto1.getPs());
	System.out.println(auto1.getMarke());
	
	
	
	
	
	}
}
