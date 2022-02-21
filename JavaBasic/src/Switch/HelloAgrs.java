package Switch;

public class HelloAgrs {

	public static void main(String[] args) {
		int size = args.length;
		switch (size) {

		case 0:
			System.out.println("Hello 0");

			break;
		case 1:
			System.out.println("Hello 1");
			break;
		case 2:
			System.out.println("Hello 2");
			break;
		case 3:
			System.out.println("Hello 3");
			break;

		default: System.out.println("D");

			break;
		}

	}

}
