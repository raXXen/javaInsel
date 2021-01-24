
public class Multiarray {

	public static void main(String[] args) {
		
		rechne(7, 8);
	}
	public static void rechne(int num, int len) {
				
				len = len + 1;
				int[] array = new int[len + 1];
				
				
				for (int i = 1; i < len; i++) {
					array[i] = i * num;
					System.out.println(array[i]);
					
				}
				
	}

}
