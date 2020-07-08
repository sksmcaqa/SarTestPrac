package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POLoginPage {
	
	WebDriver driver;
	public POLoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	private By loginLink = By.xpath("//span[contains(text(),'Login')]");
	private By userName = By.cssSelector("#user_email");
	private By password = By.cssSelector("#user_password");
	private By loginButton = By.cssSelector("input[value='Log In']");
	private By forgotPassword = By.xpath("//a[contains(text(),'Forgot Password')]");
	
	
	public WebElement getLoginLink(){
		return driver.findElement(loginLink);
	}
	
	public WebElement getUserName(){
		return driver.findElement(userName);
	}
	
	public WebElement getPassword(){
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton(){
		return driver.findElement(loginButton);
	}
	
	public WebElement getForgotPassword(){
		return driver.findElement(forgotPassword);
	}

}
