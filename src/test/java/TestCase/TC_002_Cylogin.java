package TestCase;

import org.testng.annotations.Test;

import Pageobject.CyHomepage;
import Pageobject.Cylogin;
import TestBase.BaseClass1;

public class TC_002_Cylogin extends BaseClass1 {
	@Test
	public void Acc_login() throws InterruptedException {
		CyHomepage cy=new CyHomepage(driver);
		Cylogin clogin=new Cylogin(driver);
		cy.login();
		clogin.username("demo");
		clogin.password("1234");
		Thread.sleep(2000);
		clogin.login();
	}

}
