package com.vl.qa.baseutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
	
	
	public static Properties getProperties() throws IOException
	{
		Properties prop = new Properties();
		File file = new File("Config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		fis.close();
		return prop;
	}
	
}
