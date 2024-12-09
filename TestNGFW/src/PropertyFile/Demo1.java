package PropertyFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Demo1
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get(PropFiles.getprop("./DataProperties/data.properties", "baseurl"));
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
	}

}
