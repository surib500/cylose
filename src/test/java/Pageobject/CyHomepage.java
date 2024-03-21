package Pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CyHomepage extends BasePage {
public CyHomepage(WebDriver driver) {
	super(driver);
}
@FindBy(xpath="//div[text()=' Register ']")
WebElement Regclick;

@FindBy(xpath="//input[@id='id_1']")
WebElement Name;

@FindBy(xpath="//input[@id='id_2']")
WebElement loginname;

@FindBy(xpath="//input[@id='id_3']")
WebElement email;

@FindBy(xpath="//input[@name='gender']//following-sibling::label[text()=' Male ']")
WebElement gender;

@FindBy(xpath="//button[@id='business_type']")
WebElement Option;

@FindBy(xpath="//a[@id='business_type_clothing']")
WebElement optionselect;

@FindBy(xpath="//input[@id='id_4']")
WebElement mobile;

@FindBy(xpath="//span[text()='Next']")
WebElement Next;

@FindBy(xpath="//input[@id='id_7']")
WebElement pwd;

@FindBy(xpath="//input[@id='id_8']")
WebElement confpwd;

@FindBy(xpath="//label[@for='id_9']")
WebElement agree;

@FindBy(xpath="//div[text()=' Login ']")
WebElement login;



public void Rgclick() {
	Regclick.click();
}
public void Name(String name) {
	Name.sendKeys(name);
}
public void Loginname(String Lname) {
	loginname.sendKeys(Lname);
}
public void email(String Email) {
	email.sendKeys(Email);
}
public void Gender() {
	gender.click();
}
public void option() {
	Option.click();
}
public void option1() {
	optionselect.click();
}
public void mobile(String num) {
	mobile.sendKeys(num);
}
public void next() {
	JavascriptExecutor js=(JavascriptExecutor)(driver);
	js.executeScript("arguments[0].scrollIntoView();", Next);
	Next.click();
}
public void login() {
	login.click();
}

public void pwd(String pass) {
	pwd.sendKeys(pass);
}
public void confpwd(String pass1) {
	confpwd.sendKeys(pass1);
}
public void agree() {
	agree.click();
}
}
