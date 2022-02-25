package Exercise6_4;

public class ExtractLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Akshay J";

		// System.out.println(s);

		String[] s1 = s.split("s");

		for (String string : s1) {

			System.out.println(string);

		}

	}

}
