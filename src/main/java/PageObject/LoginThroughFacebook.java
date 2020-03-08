package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginThroughFacebook 
{
	WebDriver driver;
	
@FindBy(xpath="//*[@action='https://www.abhibus.com:443/account/sign_in']/div[10]/a[@href='https://www.abhibus.com:443/account/connect_facebook']")
WebElement Fb;

@FindBy(xpath="//*[@method='post']/div/child::div/input[@name='email']")
WebElement email;

@FindBy(xpath="//*[@method='post']/div/child::div/input[@name='pass']")
WebElement pass;

@FindBy(xpath="//*[@method='post']/div/child::div[2]/following::button")
WebElement clicklink;

public LoginThroughFacebook(WebDriver driverl)
{
	driver=driverl;
	PageFactory.initElements(driverl, this);
}

public void setFacebookid()
{
	email.sendKeys("mukheshmuku9@gmail.com");
}

public void setFacebookPassword()
{
	pass.sendKeys("11129B048");
}
public void clickLogin()
{
	clicklink.click();
}
}
