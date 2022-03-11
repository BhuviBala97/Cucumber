package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\hp\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\com\\adactin\\properties\\cucumber.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getbrowser() {
		String Browser = p.getProperty("Browser");
		return Browser;

	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
}
