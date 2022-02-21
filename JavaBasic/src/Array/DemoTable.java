package Array;

public class DemoTable {

	public static void main(String[] args) {
		int[][] a = new int[10][5];

		for (int i = 0; i < a.length; i++) {
			System.out.println(" ");
			for (int j = 2; j < a[i].length; j++) {
				int sum = j+j;
				System.out.print(sum);
			}
		}
	}
}
