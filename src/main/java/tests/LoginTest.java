package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class LoginTest extends base {
	
	WebDriver driver;
	Logger logg;

	@BeforeMethod
	public void start() throws IOException
	{
		logg=(Logger) LogManager.getLogger(LoginTest.class.getName());

		driver=initializeBrowser();
		driver.get(prop.getProperty("url"));
		logg.debug("browser loaded page");
	}
	
	
	@Test
	public void login() throws IOException, InterruptedException
	{
		//logg=LogManager.getLogger(LoginTest.class.getName());
		//driver=initializeBrowser();
		//driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		lp.myAccount().click();
		lp.clicklogin().click();
		logg.debug("launched login page");
		Thread.sleep(2000);
		
		LoginPage logPage=new LoginPage(driver);
		logPage.emailfield().sendKeys(prop.getProperty("email"));
		//Thread.sleep(3000);

		logPage.password().sendKeys(prop.getProperty("password"));
		//Thread.sleep(3000); 

		logPage.loginbut().click();
		Thread.sleep(3000);
		
		AccountPage AccPage=new AccountPage(driver);
		Thread.sleep(3000);

		Assert.assertTrue(AccPage.myAccount().isDisplayed());
		logg.debug("verified myaccountpage");
					
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	


	
	

}
