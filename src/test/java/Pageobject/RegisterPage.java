package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname_text;

	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname_text;

	@FindBy(xpath="//input[@name='email']")
	WebElement email_text;

	@FindBy(xpath="//input[@name='password']")
	WebElement password_text;

	@FindBy(xpath="//button[@type='submit']")
	WebElement cont_click;

	public void first(String fname) {
		firstname_text.sendKeys(fname);
	}
	public void last(String lname) {
		lastname_text.sendKeys(lname);
	}
	public void email(String email) {
		email_text.sendKeys(email);
	}
	public void password(String pwd) {
		password_text.sendKeys(pwd);
	}
	public void cont() {
		cont_click.click();
	}
}
