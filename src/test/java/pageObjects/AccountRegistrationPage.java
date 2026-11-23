package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
		
	// Personal Details Section
	@FindBy(xpath = "//input[@id='input-firstname']")
	 WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	 WebElement lastNameField;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@id='input-telephone']")
	 WebElement telephoneField;

	// Your Password Section
	@FindBy(xpath = "//input[@id='input-password']")
	 WebElement passwordField;

	@FindBy(xpath = "//input[@id='input-confirm']")
	 WebElement passwordConfirmField;

	// Newsletter Section
	@FindBy(xpath = "//input[@name='newsletter' and @value='1']")
	 WebElement newsletterYesRadioButton;

	@FindBy(xpath = "//input[@name='newsletter' and @value='0']")
	 WebElement newsletterNoRadioButton;
	
	// Privacy Policy & Submit Section
	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyPolicyCheckbox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	 WebElement continueButton;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	 WebElement confirmationmsg;
	
	@FindBy(xpath = "//p[text()='Congratulations! Your new account has been successfully created!']")
	WebElement accountCreatedText;
	
	//Action Methods
	
	public void setFirstNameField(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void setlastNameField(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void setEmailField(String email) {
		emailField .sendKeys(email);;
	}

	public void setTelephoneField(String telephone) {
		telephoneField.sendKeys(telephone);
	}

	public void setPasswordField(String password) {
		passwordField .sendKeys(password);
	}

	public void setPasswordConfirmField(String passwordConfirm) {
		passwordConfirmField.sendKeys(passwordConfirm);
	}
	public void ClicknewsletterYesRadioButton() {
		newsletterYesRadioButton.click();
	}
	public void ClicknewsletterNoRadioButton() {
		newsletterNoRadioButton.click();
	}
	
	public void clickprivacyPolicyCheckbox() {
		privacyPolicyCheckbox.click();
	}
	
	
	public void ClickcontinueButton() {
		continueButton.click();
		/*sol-2
		 * continueButton.submit();
		 * 
		 *sol-3 
		 * Actions act=new Actions(driver);
		 * act.moveToElement(continueButton).click().build().perform();
		 * 
		 * sol-4
		 * JavascriptExecutor js= (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", continueButton);
		 * 
		 * sol-5
		 * continueButton.sendKeys(Keys.RETURN);
		 * 
		 * sol-6
		 * WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 * myWait.until(ExpectedConditions.elementToBeClickable(continueButton)).click()
		 * ;
		 */
	}
	public String getconfirmationmsg() {
		try {
			return	(confirmationmsg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
		
	}
	public String getAccountCreatedText() {
		try {
			return	(accountCreatedText.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	
	}
}
