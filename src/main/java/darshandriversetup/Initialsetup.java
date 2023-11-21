package darshandriversetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Initialsetup {
	public WebDriver odriver;
	public Properties opro;
	public static String highlight;
	public OptionsManager optionsManager;
	public WebDriver initDriver(Properties opro)
	{
		optionsManager = new OptionsManager(opro);
		highlight = opro.getProperty("highlight").trim();
		String browserName = opro.getProperty("browser").toLowerCase().trim();
		System.out.println("browser name is:"+ browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			odriver = new ChromeDriver(optionsManager.getChromeOptions());
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			odriver=new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("safari"))
		{
			odriver=new SafariDriver();
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			odriver=new EdgeDriver();
		}
		else if (browserName.equalsIgnoreCase("ie"))
		{
			odriver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("plz pass the right browser name"+ browserName);
		}
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get(opro.getProperty("url"));
		return odriver;
	}
	
	
	public Properties initprop()
	{
		opro = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resource/config/configproperties");
			opro.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return opro;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
