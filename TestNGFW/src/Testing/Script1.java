package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script1 
{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.cssSelector("input[aria-label='phone number']")).click();
	}

}
