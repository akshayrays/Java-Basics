package Array;

public class DemoA {

	public static void main(String[] args) {
		int[][] intArray = new int[3][3];
		System.out.println("Array elements are:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				intArray[i][j] = i + 1; // assign values to each array element
				System.out.print(intArray[i][j] + " "); // print each element
			}
			System.out.println();
		}

	}
}
