package Switch;

public class CalArgs {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
        String s = args[1];
        int y = Integer.parseInt(args[2]);
        int z = 0 ;
        
        if (s.equals("+")) {
            z = x+y;
        } else if (s.equals("-")){
            z = x-y;
        } else if (s.equals("*")){
            z = x*y;
        } else if (s.equals("/")){
            z = x/y;
        } else{
             System.out.println("Operator not recognized");
        }
        System.out.println(z);
	}


	
}
