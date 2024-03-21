package TestCase;

import org.testng.annotations.Test;

import Pageobject.CyHomepage;
import TestBase.BaseClass1;

public class TC_01_CyReg extends BaseClass1{
	@Test
	public void Acc_Reg() throws InterruptedException {
		CyHomepage hp=new CyHomepage(driver);
		hp.Rgclick();
		hp.Name("Suribabu");
		hp.Loginname("suribabu6612");
		hp.email("Surigaru29@gmail.com");
		hp.option();
		hp.option1();
		hp.mobile("+91 9618329079");
		Thread.sleep(3000);
		hp.next();
		Thread.sleep(2000);
		hp.pwd("6612");
		hp.confpwd("6612");
		hp.agree();
		Thread.sleep(2000);
	}

}
