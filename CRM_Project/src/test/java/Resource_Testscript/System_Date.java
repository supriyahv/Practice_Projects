package Resource_Testscript;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class System_Date {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//MM should be in upper case
		 String actualdate = sdf.format(date);
		System.out.println(actualdate);
		
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,30);
		String afterdate = sdf.format(cal.getTime());
		System.out.println(afterdate);
		
	}

}
