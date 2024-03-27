package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.base;

public class TestTwo extends base{
	public WebDriver driver;
	@Test
	public void TestTworMed() throws IOException
	{
		System.out.println("This is updated by pruvi");
		System.out.println("This is TestTwo");
		driver=initializeBrowser();
		driver.get("https://www.w3schools.com/");
		//Assert.assertFalse(true);
		//driver.close();
		
	}


	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
