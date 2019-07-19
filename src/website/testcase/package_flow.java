package website.testcase;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import website.page.mozilla_setlocation;
import website.page.package_model;
@Test
public class package_flow {
	
	public void verify_package() throws InterruptedException {
	    System.setProperty("webdriver.gecko.driver", "geckodriver");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/");
	    mozilla_setlocation moz=new mozilla_setlocation(driver);
	    moz.locn_btn();
	    moz.bnglr_btn();
	    moz.enter_loc();
	    Thread.sleep(3000);
	    driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/doorstep-car-mechanic-service-bangalore");
	    package_model pack=new package_model(driver);
	    pack.hatchback_btn();
	    pack.viewpack_btn();
	    pack.diesel_btn();
	    pack.date_btn();
	    pack.choose_pck();
	    pack.booknw_btn();
	    
	}

}
