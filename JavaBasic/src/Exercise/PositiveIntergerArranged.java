package Exercise;

public class PositiveIntergerArranged {

	public static void main(String[] args) {
		

		int[] a = { 5, 4, 3, 2, 1};
		int x = 2;
		int k = 0;

		for (int i = 0; i < a.length; i++) {

			if (x == a[i]) {
				k=i;
				System.out.println("Index of "+ x +" = " +k);
			}

		}
		if (k == 0) {
			System.out.println("-1");
		}

	}

}
