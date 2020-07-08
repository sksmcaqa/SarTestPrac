package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By search= By.xpath("//input[@type='search']");
	By product = By.cssSelector("h4.product-name");
	By productIncrement = By.cssSelector("a.increment");
	By addtokart = By.xpath("//button[contains(text(),'ADD TO')]");
	By kartIcon = By.cssSelector("a.cart-icon");
	
	
	public WebElement getSearch(){
		return driver.findElement(search);
	}
	
	public WebElement getProduct(){
		return driver.findElement(product);
	}
	
	public WebElement getProductIncrement(){
		return driver.findElement(productIncrement);
	}
	
	public WebElement getAddtokart(){
		return driver.findElement(addtokart);
	}
	
	public WebElement getKartIcon(){
		return driver.findElement(kartIcon);
	}

}
