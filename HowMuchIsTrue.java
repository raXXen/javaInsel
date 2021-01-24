
public class HowMuchIsTrue {

	public static void main(String[] args) {
		
		int zähler = 0;
		String werte[] = {"false", "false", "false", "false"};
		for (String wert : werte) {
			if (wert == "true") {
				zähler++;
			} else {
				//nichts
			}
		
		}
		System.out.println("Das Array enthielt " + zähler + " mal einen TRUE-Wert");
	}

}
