package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegTest001 extends BaseClass{
	
	@Test (groups={"Regression","Master"})
	public 	void VerifyAccountReg() {
		logger.info("*****************Starting TC001_AccountRegistrationTest001**********************************");
	try {
		
	
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		logger.info("click on MyAccount link");
		
		hp.clickRegister();
		
		logger.info("click on Regiter link");
		
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		regpage.setFirstNameField(randomString().toUpperCase());
		logger.info("Enter firstname");
		
		regpage.setlastNameField(randomString().toUpperCase());
		logger.info("Enter lastname");
		
		regpage.setEmailField(randomString()+"@gmail.com");
		logger.info("Enter Email Address");
		
		regpage.setTelephoneField(randomNumeric());
		logger.info("Enter Telephone Number");
		
		String password=randomAlphanumeric();
		
		
		regpage.setPasswordField(password);
		logger.info("Enter Password");
		
		regpage.setPasswordConfirmField(password);
		logger.info("confirmed Password");
		
		regpage.ClicknewsletterYesRadioButton();
		logger.info("click on Radio button");
		
		regpage.clickprivacyPolicyCheckbox();
		logger.info("click on checkbox");
		
		regpage.ClickcontinueButton();
		logger.info("click on Continue button");
		
		String confimMsg=regpage.getconfirmationmsg();
		Assert.assertEquals(confimMsg, "Your Account Has Been Created!");
		logger.info("**************validating Account Created Asseration Passed**********************");
		
		String confimtxt=regpage.getAccountCreatedText();
		Assert.assertEquals(confimtxt, "Congratulations! Your new account has been successfully created!");
		
	} catch (Exception e) {
		logger.error("Test failed");
		logger.debug("Debug logs...");
		Assert.fail();
	}	
	logger.info("****************Test finished TC001_AccountRegistrationTest001*************************************");
}

}