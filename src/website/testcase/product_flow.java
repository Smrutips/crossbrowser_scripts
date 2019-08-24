package website.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import website.page.mozilla_setlocation;
import website.page.product_model;

public class product_flow {
	@Test
	public void verify_product() throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "geckodriver");
		    FirefoxDriver driver = new FirefoxDriver();
		    driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/");
		    mozilla_setlocation moz=new mozilla_setlocation(driver);
		    moz.locn_btn();
		    moz.bnglr_btn();
		    moz.enter_loc();
		    Thread.sleep(3000);
		    product_model p=new product_model(driver);
		    p.cake_btn();
		    p.weight_btn();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
		    p.egg_btn();
		    p.day_btn();
		    p.view_item();
		    Thread.sleep(4000);
		    p.item_name();
		    Thread.sleep(3000);
		    p.ordernw_btn();
		    
		
	}
	
	

}
