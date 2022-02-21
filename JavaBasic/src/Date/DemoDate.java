package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		/* System.out.println(d); */
SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
String s=sdf.format(d);
System.out.println(s);

String a="11/11/111";
Date d1 =sdf.parse(a);
System.out.println(d1);
	}

}
