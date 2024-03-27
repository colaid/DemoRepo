package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class TestFour extends base{
	public WebDriver driver;

	@Test
	public void TestFourMed() throws IOException
	{
		System.out.println("This is TestFour");
		 driver=initializeBrowser();
		driver.get("https://google.com/");
		driver.close();
		
	}

}
