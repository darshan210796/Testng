package darshanseries.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import darshanseriesappconstants.ApplicationConstants;

public class Loginpagetest extends Basetest {
	@Test
	public void loginPageUrlTest()
	{
		String actualUrl = loginPage.getLoginPageURL();
		Assert.assertEquals(actualUrl, ApplicationConstants.LOGINPAGE_URL_VALUE);
	}
	@Test
	public void loginPageTitleTest()
	{
		String actualTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, ApplicationConstants.LOGINPAGE_TITLE_VALUE);
	}
	@Test
	public void loginTest()
	{
		loginPage.doLoginPage(opro.getProperty("username").trim(),opro.getProperty("password").trim());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
