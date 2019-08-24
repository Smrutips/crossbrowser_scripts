package website.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product_model {
		// TODO Auto-generated method stub
		WebDriver driver;
		By cake_btn=By.xpath("/html/body/ui-view/ui-view/home-component/home-exp-component/div[2]/div[1]/div[2]/div/div[1]");
		By weight_btn=By.xpath("/html/body/ui-view/requirement-screen-product/div[2]/div/div/md-card[1]/div/md-radio-group/md-radio-button[1]/div[1]/div[1]");
		By egg_btn=By.xpath("/html/body/ui-view/requirement-screen-product/div[2]/div/div/md-card[2]/div/md-radio-group/md-radio-button[1]/div[1]/div[1]");
		By day_btn=By.xpath("/html/body/ui-view/requirement-screen-product/div[3]/div/div/div[1]/md-card/div[2]/div/button");
		By view_item=By.xpath("/html/body/ui-view/requirement-screen-product/div[3]/div/div/div[2]/div[2]/button");
		By item_name=By.xpath("/html/body/ui-view/product-list-screen/div/div/div[2]/div/div[2]/div/md-grid-list/md-grid-tile[1]/figure/md-card/div/div[1]/div/img");
		By ordernw_btn=By.xpath("/html/body/ui-view/product-view/div/div/div[2]/div[3]/div/button");
		
		public product_model(WebDriver driver) {
			this.driver=driver;
		}
		public void cake_btn() {
			driver.findElement(cake_btn).click();
		}
		public void weight_btn() {
			driver.findElement(weight_btn).click();
		}
		public void egg_btn() {
			driver.findElement(egg_btn).click();
		}
		public void day_btn() {
			driver.findElement(day_btn).click();
		}
		public void view_item() {
			driver.findElement(view_item).click();
		}
		public void item_name() {
			driver.findElement(item_name).click();
		}
		public void ordernw_btn() {
			driver.findElement(ordernw_btn).click();
		}

	}


