import java.util.Arrays;

public class F�lleArrays {
	
	public static void main(String[] args) {
		f�lleArrays(5);
	}
	
	public static void f�lleArrays(int zahl) {
		
		int[] array = new int[zahl];
		
		Arrays.fill(array, zahl);
		
		for (int i = 0; i < zahl; i++) {
			System.out.println(Arrays.toString(array));
		}
		
	}
}
