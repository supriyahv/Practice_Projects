package GenericUtility;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class javaUtility {
	
	
	public int getRandomNum() {//generate random number
		
		Random ran = new Random();
		int randomNum=ran.nextInt(100);
		return randomNum;
	}
	
	public String getRadomString() {
		String randomString = RandomStringUtils.randomAlphabetic(5);
		return randomString;
	}
	
	public String getRadomNumber() {
		String randomNumber = RandomStringUtils.randomNumeric(10);
		return randomNumber;
	}
	
	public String getRadomAlphaNumeric() {
		String randomString = RandomStringUtils.randomAlphabetic(3);
		String randomNumber = RandomStringUtils.randomNumeric(4);
		return (randomNumber+"&"+randomString);
	}

}
