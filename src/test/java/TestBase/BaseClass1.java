package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {
public WebDriver driver;
@BeforeClass
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://demo.cyclos.org/ui/home");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterClass
public void close() {
	driver.close();
}
}
