package Array;

public class ArrayTable {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j <= 10; j++) {
				int m = i * j;
				System.out.print(m + " ");
			}
			
				System.out.println("");
			}
		
	}

}
