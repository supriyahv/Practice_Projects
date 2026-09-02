package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class CommonUtils {
	
	public static Properties loadProperties() {
		
		Properties prop = new Properties();
		try {
		FileReader fr = new FileReader("src\\test\\resources\\configData.properties");
		prop.load(fr);
		}catch(IOException e) {
			e.printStackTrace();//throws new runtime Exception
		}
		
		return prop;
	}
	
	public static String generateBrandNewEmailID() {
		Date d = new Date();
		String stringdate=d.toString();
		String nospacestring=stringdate.replaceAll(" ", "");
		String stringDate=nospacestring.replaceAll(":", "");
		String emailWithTimeStamp=stringDate+"@gmail.com";
		return emailWithTimeStamp;
	}
	
	public String generateValidEmailIDRandomGeneration() {
		
		String[] validEmail= {"arpitha@gmail.com","arpitha1@gmail.com","arpitha2@gmail.com"};
		Random random = new Random();
		int index=random.nextInt(validEmail.length);
		return validEmail[index];
	}

}
