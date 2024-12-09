package Framework1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script3 
{
	@Test
	public void compose()
	{
		Reporter.log("WriteEmail", true);
	}
	
	@Test(dependsOnMethods = "compose")
	public void sentbox()
	{
		Reporter.log("SentMail", true);
	}
	@Test(dependsOnMethods = "sentbox")
	public void trash()
	{
		Reporter.log("DeleteEmail", true);
	}
	
}
