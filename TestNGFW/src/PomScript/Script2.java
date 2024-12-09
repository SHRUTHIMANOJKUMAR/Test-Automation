package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script2 
{
	@FindBy(xpath="//span[@text()='Women Cotton Rayon Kurti Pant Set']")
	private WebElement cloth;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement buy;
	
	public Script2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void button()
	{
		buy.click();
	}
	

}
