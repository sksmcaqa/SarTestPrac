package SarojTestPkg.SarojMavenLiveProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.POHomePage;
import PageObjectModel.POLoginPage;
import Resources.MyBaseClass;
import junit.framework.Assert;

public class LoginPage extends MyBaseClass{
	
	public WebElement element;
	public WebDriver driver;
	POLoginPage lp;
	
	@BeforeTest
	public void preConditions() throws IOException, InterruptedException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		POHomePage hm = new POHomePage(driver);
		MyExpliciteWait(hm.getHomePagePopUp());
		hm.getHomePagePopUp().click();			
	}
	
	@AfterTest
	public void tearDownOpenBrowsers(){
		driver.quit();
	}
	
	@Test(priority=1)
	public void logIn(){
		lp = new POLoginPage(driver);
		Assert.assertTrue("@logIn : Login link is displaying", lp.getLoginLink().isDisplayed());	
		lp.getLoginLink().click();
	}

	@Test(enabled=true, dataProvider="getData", priority=2)
	public void loginInformatioin(String userName,String password){
		System.out.println("@loginInformatioin:");
		lp.getUserName().sendKeys(userName);
		lp.getPassword().sendKeys(password);
		lp.getLoginButton().click();
	}
	
	@Test(priority=3)
	public void loginForgotPassword(){
		System.out.println("@loginForgotPassword:");
		Assert.assertTrue(lp.getForgotPassword().isDisplayed());
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "UserName0001";
		data[0][1] = "Password0001";
		data[1][0] = "UserName0002";
		data[1][1] = "Password0002";
		
		return data;
	}
}
