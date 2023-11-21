package darshanseries.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import darshanseries.pages.LoginWithDifferentData;
import darshanseries.util.ExcelUtil;
import darshanseriesappconstants.ApplicationConstants;

public class LoginWithDifferentDataTest extends Basetest{
	@DataProvider
	public void getLoginTestData() throws IOException
	{
		ExcelUtil.getTestData(ApplicationConstants.LOGINPAGE_TEST_DATA_SHEETNAME);
		
		
		
	}


	@Test(dataProvider="getLoginTestData")
	public void  doSetupLoginData(String un,String pw)
	{
		
		loginWithDifferentData.doLoginPageWithDifferentData("Admin", "admin123");
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
