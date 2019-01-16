package entitygenerate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			FileReader fr = new FileReader("E:/gitrepository/entitygenerate/src/main/resources/datasource.properties");
			properties.load(fr);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(properties);
	}
	
}
