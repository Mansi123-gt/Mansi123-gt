package Utility;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadProperty {
	public static String readPropertyfile(String value) throws Throwable {
		Properties prop=new Properties();
		FileInputStream File=new FileInputStream("C:\\eclipse\\Frame1\\TestData\\config.properties");
		prop.load(File);
		return prop.getProperty(value);
		
}
}