package darshanseries.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import darshanseries.util.Elementutil;

public class Loginpage {
	private WebDriver odriver;
	private Elementutil eleUtil;
	private By UserName = By.xpath("//input[@name='username']");
	private By Password = By.xpath("//input[@type='password']");
	private By LoginButton = By.xpath("//button[@type='submit']");
	
	public Loginpage(WebDriver odriver)
	{
		this.odriver = odriver;
		eleUtil = new Elementutil(odriver);
	}
	public String getLoginPageTitle()
	{
	//	String title =odriver.getTitle();
		String title = eleUtil.waitForTitleContainsAndFetch(10, "OrangeHRM");
		System.out.println(title);
		return title;
	}
	public String getLoginPageURL()
	{
	//	String URL= odriver.getCurrentUrl();
		String URL = eleUtil.waitForURLContainsAndFetch(10, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(URL);
		return URL;
	}
	public Homepage doLoginPage(String un, String pw)
	{
	//	odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	odriver.findElement(UserName).sendKeys(un);
	//	odriver.findElement(Password).sendKeys(pw);
	//	odriver.findElement(LoginButton).click();
		eleUtil.waitForElementVisible(UserName, 10).isDisplayed();
		eleUtil.doSendKeys(UserName, un);
		eleUtil.doSendKeys(Password, pw);
		eleUtil.doClick(LoginButton);
		return new Homepage(odriver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
