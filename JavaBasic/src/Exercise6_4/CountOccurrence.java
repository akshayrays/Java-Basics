package Exercise6_4;

public class CountOccurrence {

	public static void main(String[] args) {

		String s = "Akshay ajay";

		char c = 'y';

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (c == s.charAt(i)) {

				count++;

			}

		}
		System.out.println(count);

	}
}
