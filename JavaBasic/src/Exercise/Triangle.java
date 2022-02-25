package Exercise;

public class Triangle {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;

		for (i = 1; i <= 3; i++) {
			
				System.out.println(i);
			i=i+1;
			for (j = 2; j <= 4; j++) {

				
					System.out.println(i + " " + j);
				
				i = i + 1;
				System.out.println(i + " " + i + " " + i);
				i = i + 1;
				System.out.println(i + " " + i + " " + i + " " + i + " " + i);
				j = i + 1;
			}

		}
		}
	}


