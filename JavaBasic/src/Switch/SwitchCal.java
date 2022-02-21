package Switch;

public class SwitchCal {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		int sum;

		switch (4) {
		case 1:
			sum = a + b;
			System.out.println(sum);
			break;
		case 2:
			sum = a * b;

			System.out.println(sum);
			break;
		case 3:
			sum = a - b;
			System.out.println(sum);
			break;
		case 4:
			sum = a / b;
			System.out.println(sum);
			break;
		default:

			System.out.println("invalid no");
		}

	}

}
