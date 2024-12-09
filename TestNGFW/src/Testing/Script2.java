package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Script2 
{
	@Test
	public void test2() 
	
	{System.setProperty("webdriver.gecko.driver" , "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	
	WebElement ele  = driver.findElement(By.id("select3"));
	Select s=new Select(ele);
	s.selectByIndex(1);
		
	}

}
