import java.util.Random;

public class ZufälligeZahlen {

	public static void main(String[] args) {
	
		Random zahl = new Random();
		
		
		int z = zahl.nextInt(100); //0 bis 99
		z++;//0 bis 100 
		System.out.println(z);
		
		
	}

}
