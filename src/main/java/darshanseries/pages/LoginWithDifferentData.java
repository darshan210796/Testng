package darshanseries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import darshanseries.util.Elementutil;

public class LoginWithDifferentData {
	private WebDriver odriver;
	private Elementutil eleUtil;
	
	private By userName=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By loginButton=By.xpath("//button[@type='submit']");
	
	
	public LoginWithDifferentData(WebDriver odriver){
		this.odriver=odriver;	
		eleUtil=new Elementutil(odriver);
	}
	
	public Homepage doLoginPageWithDifferentData(String un,String pw){
		eleUtil.waitForElementVisible(userName, 20).isDisplayed();
		eleUtil.doSendKeys(userName, un);
		eleUtil.doSendKeys(password, pw);
		eleUtil.doClick(loginButton);
		return new Homepage(odriver);	

	}
	
	

}


