package PomRunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PomScript.PomScript1;

public class Script1 
{
	

	private PomScript1 p;

	@Test
	public void validData() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		PomScript1 p = new PomScript1(driver);
		p.users("selenium");
		p.password("@123");
		p.button();
		
		//UnhandledAlertException

		
		
	
	}

}
