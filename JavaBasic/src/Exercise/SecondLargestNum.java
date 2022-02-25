package Exercise;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1000,2000,300,200,50};
		int[] b = a;
		int x=0;
		int y=0;
		
		for (int i = 0; i < b.length; i++) {
			
			if(b[i] > x) {
				y=x;
				x=b[i];
				
			}
			else if (b[i] > y && b[i] < x) {
				y=b[i];
			}
		}
		System.out.println(y);
				
	}

}
