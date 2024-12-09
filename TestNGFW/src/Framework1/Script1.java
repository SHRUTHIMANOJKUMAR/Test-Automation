package Framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 
{
	@Test
	public void test1() 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		Reporter.log(title);
		
	}

}
