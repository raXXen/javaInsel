
public class HowMuchIsTrue {

	public static void main(String[] args) {
		
		int z�hler = 0;
		String werte[] = {"false", "false", "false", "false"};
		for (String wert : werte) {
			if (wert == "true") {
				z�hler++;
			} else {
				//nichts
			}
		
		}
		System.out.println("Das Array enthielt " + z�hler + " mal einen TRUE-Wert");
	}

}
