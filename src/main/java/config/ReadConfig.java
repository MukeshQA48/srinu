package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
public static Properties po;
public ReadConfig()
{
		File src=new File("./config/Config.properties");
	   try {
		FileInputStream fis=new FileInputStream(src);
		po=new Properties();
		po.load(fis);
	}
	   catch(Exception e)
	   {
		   System.out.println("Exception is "+e.getMessage());
	   }
	
	
}
public static String getApplicationUrl()
{
	String url=po.getProperty("baseurl");
	return url;
}

public static String getUsername()
{
	String un=po.getProperty("username");
	return un;
}

public static String getPassword()
{
	String pwd=po.getProperty("password");
	return pwd;
}

}
