package darshanseries.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import darshandriversetup.Initialsetup;
import darshanseries.pages.Homepage;
import darshanseries.pages.LoginWithDifferentData;
import darshanseries.pages.Loginpage;

public class Basetest {
	Initialsetup is;
	WebDriver odriver;
	public Properties opro;
	protected Loginpage loginPage;
	protected Homepage homePage;
	protected LoginWithDifferentData loginWithDifferentData;
	@BeforeTest
	public void setup()
	{
		is = new Initialsetup();
		opro = is.initprop();
		 odriver=is.initDriver(opro);
		loginPage=new Loginpage(odriver);
		loginWithDifferentData = new LoginWithDifferentData(odriver);
	}
	@AfterTest
	public void closeapp()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
