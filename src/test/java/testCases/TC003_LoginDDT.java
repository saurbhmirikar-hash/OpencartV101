package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ch.qos.logback.core.pattern.color.MagentaCompositeConverter;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{
	
	@Test (dataProvider = "LoginData",dataProviderClass = DataProviders.class) //getting data provider from different class
	public void Verify_loginDDT(String email,String pwd,String exp) {
	
		logger.info("***************Starting TC003_LoginDDT **************************");
		try {
				//Home Page
				HomePage hp=new HomePage(driver);
				hp.clickMyAccount();
				hp.clicklogin();
				//loginPage
				LoginPage lp=new LoginPage(driver);
				lp.setEmail(email);
				lp.setpasswordlg(pwd);
				lp.clickloginbutton();
				//MyAccount Page
				MyAccountPage macc=new MyAccountPage(driver);
				boolean targetPage=	macc.isMyAccountPageExist();
	
				/*  Data is valid -login success - Test pass -logout
				 * 					login failed -test failed
				 * 
				 *  Data is invalid -login success test failed -logout
				 *    				-login failed  test passed 
				 */				
				
				if(exp.equalsIgnoreCase("Valid")) 
				{
					if(targetPage==true) {
						macc.clickLogout();
						Assert.assertTrue(true);
					}
					else {
						Assert.assertTrue(false);
					}
				}
				if(exp.equalsIgnoreCase("Invalid")) 
				{
					if(targetPage==true) {
						macc.clickLogout();
						Assert.assertTrue(false);
					}
					else {
						Assert.assertTrue(true);
					}
				}
				
		}catch (Exception e) {
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}finally {
			logger.info("***************Finished TC003_LoginDDT **************************");
		}
		
	}

}
