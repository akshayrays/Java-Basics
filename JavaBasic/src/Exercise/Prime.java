package Exercise;

public class Prime {

	public static void main(String[] args) {

		int i = 2;
		int n = 2;
		if (n < i)
			;
		{
			System.out.println("is not prime");
		}
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (n == 1) {
					System.out.println("prime no");
				} else {
					System.out.println("not prime no");
					break;
				}
			}
		}

	}
}
