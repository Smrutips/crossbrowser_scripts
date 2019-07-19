package website.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class quick_model {
	WebDriver driver;
	By booknw_btn=By.xpath("/html/body/ui-view/ui-view/intermediate-screen/div[1]/div[2]/div/div[1]/div[2]/div[2]/button");
	By date_btn=By.xpath("/html/body/ui-view/requirement-screen/div[2]/div/div/div[1]/md-card/div[2]/div/button[1]");
	By proceed_btn=By.xpath("/html/body/ui-view/requirement-screen/div[2]/div/div/div[2]/div[2]/button");
	
	public quick_model(WebDriver driver) {
		this.driver=driver;
	}
	public void booknw_btn() {
		driver.findElement(booknw_btn).click();
	}
	public void date_btn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(date_btn).click();
	}
	public void proceed_btn() {
		driver.findElement(proceed_btn).click();
	}
	

}
