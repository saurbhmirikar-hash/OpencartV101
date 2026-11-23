package pageObjects;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@placeholder='E-Mail Address']")
	WebElement email;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwd;
	@FindBy(linkText = "Forgotten Password")
	WebElement Forgotten_Password;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement loginbutton;
	
//	Action methods
	public void setEmail(String  useremailaddress) {
		email.sendKeys(useremailaddress);
	}
	public void setpasswordlg(String  passwordString) {
		pwd.sendKeys(passwordString);
	}
	public void clickloginbutton() {
		loginbutton.click();
	}
	public void Forgotten_Passwordclickon() {
		Forgotten_Password.click();
	}
}
