package Resource_Testscrpit;

import java.util.Date;

public class random_Email {
	
	public static void main(String[] args) {
		
	Date d = new Date();
	//System.out.println(d);//Date type
	String stringdate=d.toString();
	//System.out.println(stringdate);//converted to string to perform string related action like replace
	String nospacestring=stringdate.replaceAll(" ", "");
	//System.out.println(nospacestring);
	String stringDate=nospacestring.replaceAll(":", "");
	//System.out.println(stringDate);
	String emailWithTimeStamp=stringDate+"@gmail.com";
	System.out.println(emailWithTimeStamp);
}
}
