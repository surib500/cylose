package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CyPay_postive  extends BasePage{
	public CyPay_postive(WebDriver driver) {
	super(driver);}
	@FindBy(xpath="//div[text()=' Pay user ']")
	WebElement payicon;
	@FindBy(xpath="//div[@class='d-flex']//following-sibling::*[@type='button']")
	WebElement contact;
	@FindBy(xpath="//a[text()=' Green shop ']")
	WebElement selcontact;
	@FindBy(xpath="//input[@id='id_3']")
	WebElement money;
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement confirm;
	@FindBy(xpath="//button[@type='button'][@class='btn']")
	WebElement print;
	
	public void payicon() {
		payicon.click();
	}
	public void contact() {
		contact.click();
	}
	public void selcontact() {
		selcontact.click();
	}
	public void money(String value) {
		money.sendKeys(value);
	}
	public void confirm() {
		confirm.click();
	}
	public void print() {
		print.click();
	}

}
