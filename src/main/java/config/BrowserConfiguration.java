package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BrowserConfiguration 
{
	Properties pro;
public BrowserConfiguration()
{
	File src=new File("./config/BrowserDrivers.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	} 
	catch(Exception e)
	{
		System.out.println("Exception is "+e.getMessage());
	}
	
}

public String getChromePath() {
	String chrome=pro.getProperty("chromepath");
	return chrome;
	
}

public String getFirefoxPath()
{
	String firefox=pro.getProperty("firefoxpath");
	return firefox;
}

public String getIEpath()
{
	String iepath=pro.getProperty("iEpath");
	return iepath;
}
}
