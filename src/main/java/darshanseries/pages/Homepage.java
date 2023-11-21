package darshanseries.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import darshanseries.util.Elementutil;

public class Homepage {
	private WebDriver odriver;
	private Elementutil eleUtil;
	By admin =By.xpath("//span[text()='Admin']");
	By username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");	
	public Homepage(WebDriver odriver) {
		this.odriver=odriver;
		eleUtil = new Elementutil(odriver);
	}
	public String getHomePageTitle()
	{
	//	String title = odriver.getTitle();
		String title = eleUtil.waitForTitleContainsAndFetch(10, "OrangeHRM");
		System.out.println(title);
		return title;
	}
	public String getHomePageURL()
	{
	//	String url=odriver.getCurrentUrl();
		String URL = eleUtil.waitForURLContainsAndFetch(10, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println(URL);
		return URL;
	}
	public void systemUserDetails()
	{
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	//	odriver.findElement(admin).click();
	//	odriver.findElement(username).sendKeys("darshan");
		eleUtil.doClick(admin);
		eleUtil.doSendKeys(username, "darshan");
	}

}
