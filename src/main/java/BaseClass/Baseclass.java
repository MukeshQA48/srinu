package BaseClass;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import config.ReadConfig;

public class Baseclass 
{
	public String url=ReadConfig.getApplicationUrl();
	public String username=ReadConfig.getUsername();
	public String password=ReadConfig.getPassword();
	
	public static WebDriver driver;
	
	public static Logger logger;
	@Parameters("browser")
	@Beforeclass
	public void setup(String br)
	{
		
	}

}
