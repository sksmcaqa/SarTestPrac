package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POHomePage {
	WebDriver driver;
	public POHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	private By homePageText = By.cssSelector("#myCarousel div div div div div ");
	private By homePagePopUp = By.xpath("//*[@id='homepage']/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]");
	private By homePageNavigationBar = By.cssSelector(".nav.navbar-nav.navbar-right");
	private By homePageNavigationBarCount = By.cssSelector(".nav.navbar-nav.navbar-right li");
	
	public WebElement getHomePageText(){
		return driver.findElement(homePageText);
	}
	
	public WebElement getHomePagePopUp(){
		return driver.findElement(homePagePopUp);
	}
	
	public WebElement getHomePageNavigationBar(){
		return driver.findElement(homePageNavigationBar);
	}

	public List<WebElement> getHomePageNavigationBarCount(){
		return driver.findElements(homePageNavigationBarCount);
	}
}
