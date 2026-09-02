package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber() {
		Random ran = new Random();
		int ranDom=ran.nextInt(1000);
		return ranDom;
	}
	
	public String getSystemDataYYYYMMDD() {
		
		Date dateobj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		String date=sdf.format(dateobj);
		return date;
		
	}

}
