package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
@FindBy(xpath = "//*[@class='open']")
WebElement Login;

@FindBy(xpath = "//*[@action='https://www.abhibus.com:443/account/sign_in']/div[3]/descendant::input")
WebElement username;

@FindBy(xpath="//*[@action='https://www.abhibus.com:443/account/sign_in']/div[4]/descendant::input")
WebElement password;

@FindBy(xpath="//*[@action='https://www.abhibus.com:443/account/sign_in']/div[8]/child::input")
WebElement Signinbutton;

@FindBy(xpath="//*[@action='https://www.abhibus.com:443/account/sign_in']/div[5]/p/a[@id='forgotPwd_click']")
WebElement ForgotPassword;

@FindBy(xpath="//*[@action='https://www.abhibus.com:443/account/sign_in']/div[6]/child::input")
WebElement keepmesignin;

public LoginPage(WebDriver driver1)
{
	driver=driver1;
	PageFactory.initElements(driver1, this);
}

public  void Loginfunc()
{
	Login.click();
}

public void enterEmail(String un)
{
	username.sendKeys("mukhesh1994@gmail.com");
}
public void enterPassword(String pw)
{
	password.sendKeys("Mukhesh@48");
}
public void signIn()
{
	Signinbutton.click();
}
public void forgotPassword()
{
	ForgotPassword.click();
}
public void checkKeepsign()
{
	keepmesignin.isSelected();
}
}
