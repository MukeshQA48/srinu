package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginthroughgoogle 
{
   WebDriver driver;
   
   
	@FindBy(xpath="//*[@action='https://www.abhibus.com:443/account/sign_in']/div[10]/a[@id='customBtn']")
	WebElement clickbtn;
	
	@FindBy(xpath="//*[@class='BHzsHc']")
	WebElement useanotherAccount;
	
	public Loginthroughgoogle(WebDriver driverg)
	{
		driver=driverg;
		PageFactory.initElements(driverg, this);
	}
	
	public void clickanotherAccount()
	{
		useanotherAccount.click();
	}
	

}
