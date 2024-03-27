package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class LoginPage extends base {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	public void Starting() throws IOException
	{
		driver=initializeBrowser();
	}

	@FindBy(id="input-email")
	WebElement emailfield;
	
	public WebElement emailfield()
	{
		return emailfield;
	}

	
	
	@FindBy(id="input-password")
	WebElement password;
	
	public WebElement password ()
	{
		return password;
	}
	
	@FindBy(css="input[class='btn btn-primary']")
	WebElement loginbut;
	
	public WebElement loginbut ()
	{
		return loginbut;
	}
	
}
