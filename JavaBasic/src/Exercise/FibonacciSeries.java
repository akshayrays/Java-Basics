package Exercise;

// add karta 1x2= 3 +2=5 5+3=9
public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c;

		System.out.println(a);
		for (int i = 0; i < 10; i++) {
			{
				c = a + b;
				System.out.println("" + c);
			}
			a=b;
			b=c;
		}
	}

}
