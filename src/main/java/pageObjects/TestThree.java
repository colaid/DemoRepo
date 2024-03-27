package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.base;

public class TestThree extends base {
	public WebDriver driver;

	@Test
	public void TesThreeMed() throws IOException
	{
		System.out.println("This is TestThree");
	 driver=initializeBrowser();
		driver.get("https://google.com/");
		Assert.assertFalse(true);

		
		
		
	}

	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
