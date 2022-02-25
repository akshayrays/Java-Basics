package Test;

public class PalindromeReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 128;
		int j = i;
		int r = 0;
		int reverse = 0;
		while (i > 0) {
			int m = i % 10;
			i = i/ 10;
			reverse = reverse * 10 + (m);
			System.out.println(reverse);
//			i = i + 10;
		}
		if (j == reverse) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
