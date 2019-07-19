package website.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class package_model {
	WebDriver driver;
	By hatchback_btn=By.xpath("/html/body/ui-view/ui-view/intermediate-screen/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/img");
	By viewpack_btn=By.xpath("/html/body/ui-view/ui-view/intermediate-screen/div[1]/div[2]/div/div[2]/div[4]/div/div/div/div/button");
	By diesel_btn=By.xpath("/html/body/ui-view/requirement-screen/div[2]/div/div/md-card/div/md-radio-group/md-radio-button[1]/div[1]");
	By date_btn=By.xpath("/html/body/ui-view/requirement-screen/div[4]/div/div/div[1]/md-card/div[2]/div/button[1]");
	By choose_pck=By.xpath("/html/body/ui-view/requirement-screen/div[4]/div/div/div[2]/div[2]/button");
	By booknw_btn=By.xpath("/html/body/ui-view/vendor-list-screen/div[1]/div/div/div[2]/md-card/div/div[2]/div[2]/div[2]/md-card-actions/button[2]");
	
	public package_model(WebDriver driver) {
		this.driver=driver;
	}
	public void hatchback_btn() {
		driver.findElement(hatchback_btn).click();
	}
	public void viewpack_btn() {
		driver.findElement(viewpack_btn).click();
	}
	public void diesel_btn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(diesel_btn).click();
	}
	public void date_btn() {
		driver.findElement(date_btn).click();
	}
	public void choose_pck() {
		driver.findElement(choose_pck).click();
	}
	public void booknw_btn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(booknw_btn).click();
	}
	

}
