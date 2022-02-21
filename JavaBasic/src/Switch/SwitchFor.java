package Switch;

public class SwitchFor {

	public static void main(String[] args) {
		int size = args.length;
		switch (size) {
		case 0:
			System.out.println("Usage : java HelloAll n1 n2 n3..");

			break;
		case 1:
			System.out.println("Hello" + args[0]);
			break;
		/*
		 * case 2: System.out.println("Hello " + args [2]); break; case 3:
		 * System.out.println("Hello" + args[3]); break;
		 */

		default:
			for (int i = 0; i < size; i++)
				System.out.println(i + "= Hello" + args[i]);
		}
	}

}
