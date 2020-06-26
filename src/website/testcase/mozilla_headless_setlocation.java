package website.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Test;

import website.page.mozilla_setlocation;
@Test
public class mozilla_headless_setlocation {
	public void verifylocation() throws InterruptedException {
		//FirefoxBinary firefoxBinary = new FirefoxBinary();
	    //firefoxBinary.addCommandLineOptions("--headless");
	    System.setProperty("webdriver.gecko.driver", "geckodriver");
	   // FirefoxOptions firefoxOptions = new FirefoxOptions();
	    //firefoxOptions.setBinary(firefoxBinary);
	    //FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
	    WebDriver driver=new FirefoxDriver();
	    driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/");
	    mozilla_setlocation moz=new mozilla_setlocation(driver);
	   // moz.locn_btn();
	    //moz.bnglr_btn();
	    //moz.enter_loc();

}
}
