package TestCase;

import org.testng.annotations.Test;

import Pageobject.HomePage;
import Pageobject.RegisterPage;
import TestBase.BaseClass;

public class TC_001_Registration extends BaseClass{
	@Test
	public void AcctReg() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegisterPage rp=new RegisterPage(driver);
		//Homepage click options 
		log.debug("************Application logs**************");
		log.info("*********	Enter Username*********");
		hp.username(RB.getString("uname"));
		log.info("*********Enter Password*********");
		hp.password(RB.getString("pwd"));
		log.info("*********Clicking on Login button*********");
		hp.login();
		Thread.sleep(5000);
	}
}
