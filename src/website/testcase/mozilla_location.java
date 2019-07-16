package website.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import website.page.mozilla_setlocation;
@Test
public class mozilla_location {
	
	public void verifymozilla_location() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/");
		mozilla_setlocation moz=new mozilla_setlocation(driver);
		moz.locn_btn();
		moz.bnglr_btn();
		moz.enter_loc();
		//driver.close();
		
	}

}
