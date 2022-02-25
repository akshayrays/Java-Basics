package Test;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12;
		int sum = 0;
		int sum1= 0;
		
		for (i=1;i<=12;i++) {
			
			if(i>0)
			{
				sum= sum+i;
			}
			else {
				sum1 = sum1+i;
			}
		}
		int average = sum/i;
		System.out.println(average);
		int average1 =sum1/i;
		System.out.println(average1);
	}

}
