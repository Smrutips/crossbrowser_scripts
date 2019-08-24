package website.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mozilla_setlocation {
	WebDriver driver;
	By locn_btn=By.xpath("/html/body/header/div[1]/div/div[2]/label");
	By bnglr_btn=By.xpath("/html/body/div[7]/md-dialog/div/div[2]/md-grid-list/md-grid-tile[1]/figure/md-card/md-card-content/div[2]/div/img");
	By enter_loc=By.xpath("/html/body/div[7]/md-dialog/div/div[4]/input");
	
	public mozilla_setlocation(WebDriver driver) {
		this.driver=driver;
	}
	public void locn_btn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(locn_btn).click();
	}
	public void bnglr_btn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(bnglr_btn).click();
	}
	public void enter_loc() throws InterruptedException {
		Thread.sleep(3000);
		WebElement loc = driver.findElement(enter_loc);
		loc.click();
		Thread.sleep(500);
		loc.sendKeys("Rajajinagar");
		Thread.sleep(500);
		loc.sendKeys(Keys.DOWN);
		loc.sendKeys(Keys.DOWN);
		loc.sendKeys(Keys.DOWN);
		Thread.sleep(500);
		loc.sendKeys(Keys.ENTER);
		loc.sendKeys(Keys.ENTER);

		
		
		
	}
	

}
