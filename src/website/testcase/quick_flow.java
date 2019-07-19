package website.testcase;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import website.page.mozilla_setlocation;
import website.page.quick_model;
@Test
public class quick_flow {
	public void verify_quick() throws InterruptedException {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
	    firefoxBinary.addCommandLineOptions("--headless");
	    System.setProperty("webdriver.gecko.driver", "geckodriver");
	    FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setBinary(firefoxBinary);
	    FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
	    driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/");
	    mozilla_setlocation moz=new mozilla_setlocation(driver);
	    moz.locn_btn();
	    moz.bnglr_btn();
	    moz.enter_loc();
	    Thread.sleep(3000);
	    driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/carpenter-services-bangalore");
	    quick_model quick=new quick_model(driver);
	    Thread.sleep(2000);
	    quick.booknw_btn();
	    quick.date_btn();
	    quick.proceed_btn();
    

	}
}
