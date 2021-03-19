package collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		String path = "src/collections/database.properties";
		path = PropertiesExample.class.getResource("database_properties").getPath();
		Properties properties = new Properties();
		
		try {
			properties.load(new FileReader(path));
			properties.getProperty(path);
			String driver = properties.getProperty("driver");
			String user = properties.getProperty("user");
			String pass = properties.getProperty("pass");
			String url = properties.getProperty("url");
			System.out.println(driver);
			System.out.println(user);
			System.out.println(pass);
			System.out.println(url);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
