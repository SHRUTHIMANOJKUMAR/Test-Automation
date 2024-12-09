package Framework1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript1 
{
	public static WebDriver driver;
	@BeforeMethod
	public void openingAppIn()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		
	}
	
	@AfterMethod
	public void closingAppIn() throws IOException
	{
		GenericScript2.capturePic();
		driver.close();
		
	}
}
