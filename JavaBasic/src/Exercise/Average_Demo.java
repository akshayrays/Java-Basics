package Exercise;

public class Average_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		int evenc = 0;
		int oddc = 0;
		int evensum = 0;
		int oddsum = 0;

		while (n >= 0) {
			if (n % 2 == 0) {
				evenc++;
				evensum = evensum + n;
			} else {
				oddc++;
				oddsum = oddsum + n;
			}
			n--;
		}

		int evenavg = evensum / evenc;
		int oddavg = oddsum / oddc;

		System.out.println(evenavg);
		System.out.println(oddavg);

	}

}
