package darshanseries.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import darshanseriesappconstants.ApplicationConstants;

public class Homepagetest extends Basetest{
	@BeforeClass
	public void homePageSetUP()
	{
		homePage= loginPage.doLoginPage(opro.getProperty("username").trim(),opro.getProperty("password").trim());
	}
	@Test
	public void homePageURLTest()
	{
		String actualHomePageURL =homePage.getHomePageURL();
		Assert.assertEquals(actualHomePageURL, ApplicationConstants.HOMEPAGE_URL_VALUE);
	}
	@Test
	public void homePageTitleTest()
	{
		String actualHomePageTitle= homePage.getHomePageTitle();
		Assert.assertEquals(actualHomePageTitle, ApplicationConstants.HOMEPAGE_TITLE_VALUE);
	}
	@Test
	public void systemUserDetailsTest()
	{
		homePage.systemUserDetails();
	}
	@AfterClass
	public void CloseApp()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
