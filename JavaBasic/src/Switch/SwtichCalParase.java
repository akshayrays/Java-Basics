package Switch;

public class SwtichCalParase {

	public static void main(String[] args) throws NumberFormatException {
		String size = args[0];
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		int c;
		switch (size) {
		case "add":
			c = a + b;
			System.out.println("add =" + c);
			break;
		case "sub":
			if (a > b) {
				c=a-b;
			System.out.println(+c);
			} else {
				c = b-a;
			
			
			System.out.println("sub=" + c);
			}
			break;
		case "multi":
			c = a * b;
			System.out.println("mul=" + c);
			break;

		case "div":
			if (a > b) {
				c = a / b;
			} else {
				c = b / a;
			}

			System.out.println("div=" + c);
			break;
		default:

			System.out.println("invalid no");
		}

	}
}