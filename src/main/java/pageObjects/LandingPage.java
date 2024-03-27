package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class LandingPage extends base {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	public void Starting() throws IOException
	{
		driver=initializeBrowser();
	}

	@FindBy(xpath="//a[text()='My Account']")
	WebElement myAccount;
	
	public WebElement myAccount()
	{
		return myAccount;
	}

	@FindBy(linkText="Login")
	WebElement clicklogin;
	
	public WebElement clicklogin()
	{
		return clicklogin;
	}

}
