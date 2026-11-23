package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	//locators
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myaccountlink;
	@FindBy(linkText = "Register")
	WebElement registerlink;
	@FindBy(linkText = "Login")
	WebElement loginlink;
	
	//Action Methods
	public void clickMyAccount() {
		myaccountlink.click();
	}
	public void clickRegister() {
		registerlink.click();
	}
	public void clicklogin() {
		loginlink.click();
	}
	
	}
