package Framework1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript2 extends GenericScript1
{
	@Test
	public void runScript()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void runScript1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		
	}

}
