package Exercise;

public class HarmonicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n= 5;
double result =0.0;
System.out.println("the harmonic series is :" );
for (int i =n; i>=0; i--)
{
	result = result + (double)1/i;
	System.out.println("the harmonic series is : " + result);
}
	}

}
