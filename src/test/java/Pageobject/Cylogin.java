package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cylogin extends BasePage{
	public Cylogin(WebDriver driver) {
		super(driver);}

	@FindBy(xpath="//input[@autocomplete='username']")
	WebElement username;
	@FindBy(xpath="//input[@autocomplete='password']")
	WebElement password;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	
	public void username(String uname) {
		username.sendKeys(uname);
	}
	public void password(String pwd) {
		password.sendKeys(pwd);
	}
public void login() {
	submit.click();
}
}
