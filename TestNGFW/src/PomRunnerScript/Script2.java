package PomRunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script2 
{
	public Script2(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void flipkart() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/trahimam-women-kurti-pant-set/p/itm2a0dd70f8c0f0?pid=ETHGYWQ4KNWUCUWX&lid=LSTETHGYWQ4KNWUCUWXV6K2ZL&marketplace=FLIPKART&store=clo&srno=b_1_5&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Fashion~Women%2BEthnic_HQXTE43PO8HC&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L1_view-all&fm=organic&iid=en_AHf9oiw9tKMPa_e6bD1R5-0nHInUrcVjr1PyLKFqaI2izBeuOlW1puvk2dlT1pkWD_LHtyIZopQmQKfpkGuhJw%3D%3D&ppt=browse&ppn=browse&ssid=4kinci24w3tkdkao1733206428913");
		
		Script2 s = new Script2(driver);
		s.button();
		
		
		
	}

	private void button() {
		// TODO Auto-generated method stub
		
	}

}
