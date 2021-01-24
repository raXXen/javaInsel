import java.util.Arrays;

public class FülleArrays {
	
	public static void main(String[] args) {
		fülleArrays(5);
	}
	
	public static void fülleArrays(int zahl) {
		
		int[] array = new int[zahl];
		
		Arrays.fill(array, zahl);
		
		for (int i = 0; i < zahl; i++) {
			System.out.println(Arrays.toString(array));
		}
		
	}
}
