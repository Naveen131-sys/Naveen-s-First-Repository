package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	public Properties prop;FileInputStream fis;
	
	public BaseClass() {
	
	prop = new Properties();
	
	try {
		fis = new FileInputStream("C:\\Users\\NAVEEN\\eclipse-workspace\\API_Testing\\src\\main\\java\\com\\qa\\config\\ConfigurationFile");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
