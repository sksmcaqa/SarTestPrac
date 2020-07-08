package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KartPage {
	
	public WebDriver driver;
	
	public KartPage(WebDriver driver){
		this.driver = driver;
	}
	
	By proceedToCheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	public WebElement getProceedToCheckout(){
		return driver.findElement(proceedToCheckout);
	}

}
