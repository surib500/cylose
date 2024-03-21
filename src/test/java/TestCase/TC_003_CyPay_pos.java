package TestCase;

import org.testng.annotations.Test;

import Pageobject.CyHomepage;
import Pageobject.CyPay_postive;
import Pageobject.Cylogin;
import TestBase.BaseClass1;

public class TC_003_CyPay_pos extends BaseClass1 {
	@Test
	public void Pay() throws InterruptedException {
		CyHomepage chome=new CyHomepage(driver);
		Cylogin clog=new Cylogin(driver);
		CyPay_postive cpay=new CyPay_postive(driver); 
		chome.login();
		clog.username("demo");
		clog.password("1234");
		clog.login();
		Thread.sleep(2000);
		cpay.payicon();
		Thread.sleep(1000);
		cpay.contact();
		Thread.sleep(1000);
		cpay.selcontact();
		Thread.sleep(2000);
		cpay.money("10");
		chome.next();
		Thread.sleep(2000);
		cpay.confirm();
		Thread.sleep(2000);
		cpay.print();
		Thread.sleep(2000);
	}

}
