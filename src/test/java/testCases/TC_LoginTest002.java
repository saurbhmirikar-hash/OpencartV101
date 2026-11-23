package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_LoginTest002 extends BaseClass{

	@Test (groups={"Sanity","Master"})
	public void  Verify_login() {
		logger.info("*********Starting TC_LoginTest002**********");
		try {
			
	
		//home Page
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		//loginPage
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setpasswordlg(p.getProperty("password"));
		lp.clickloginbutton();
		//MyAccount Page
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=	macc.isMyAccountPageExist();
		Assert.assertEquals(targetPage, true);
		
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("*********Finish TC_LoginTest002**********");
	}

}
