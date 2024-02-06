package TestBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	public ResourceBundle RB;
	public Logger log;
	@BeforeClass
public void setup() {
		RB=ResourceBundle.getBundle("config");
		log=LogManager.getLogger(this.getClass());
	driver=new ChromeDriver();
	log.info("*********Launch application*********");
	driver.get(RB.getString("URL"));
	log.info("*********maximize window*********");
	driver.manage().window().maximize();
	log.info("********Time duration applied**********");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterClass
public void close() {
	driver.close();
}

public String capture(String tname) {
	String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	TakesScreenshot ss=(TakesScreenshot)driver;
	File source=ss.getScreenshotAs(OutputType.FILE);
	String Des=System.getProperty("user.dir")+"\\Capture\\"+tname+"_"+timestamp+".png";
	try {
		FileUtils.copyFile(source, new File(Des));
	}catch(Exception e) {
		e.getMessage();
	}
	return Des;
}
}
