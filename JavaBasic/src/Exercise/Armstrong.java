package Exercise;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =15;
		int sum = 0;
		while (n > 0)
		{
			int r = n % 10;
			n = n / 10;
			int rem = r * r * r;
			sum=sum+rem;
			System.out.println(sum);
		}
	}

}
