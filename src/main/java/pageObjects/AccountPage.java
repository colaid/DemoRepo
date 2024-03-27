package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class AccountPage extends base {
	
	public WebDriver driver;

	
	public AccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	public void Starting() throws IOException
	{
		driver=initializeBrowser();
	}

	@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Account']")
	WebElement myAccountcheck;
	
	public WebElement myAccount()
	{
		return myAccountcheck;
	}
	
}
