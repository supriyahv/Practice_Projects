package GenericUtility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class fileUtility {
	
	public String getDataFromPropertyFile(String key) throws IOException {
		FileReader fis = new FileReader("./src\\test\\resources\\commonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	
	
	}

}
