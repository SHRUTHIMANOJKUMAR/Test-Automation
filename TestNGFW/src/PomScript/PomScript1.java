package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript1 
{
	
	@FindBy (id="email")
	private WebElement id;
	
	@FindBy (id="pass")
	private WebElement psw;
	
	@FindBy (xpath="//button[@placeholder='login']")
	private WebElement log;

	
	
	public PomScript1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void users(String UN)
	{
		//us.sendKeys(UN);
	}
	public void password(String pw)
	{
		psw.sendKeys(pw);
	}
	public void button()
	{
		log.click();
	}

}
