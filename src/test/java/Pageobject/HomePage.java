package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);		
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement uname;

	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;

	public void username(String username) {
		uname.sendKeys(username);
	}
	public void password(String password) {
		pwd.sendKeys(password);
	}
	public void login() {
		login.click();
	}

}
