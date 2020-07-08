package SarojTestPkg.SarojMavenLiveProject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.POHomePage;
import Resources.MyBaseClass;
import junit.framework.Assert;


public class HomePageValidation extends MyBaseClass{
	
	public WebElement element;
	public WebDriver driver;
	POHomePage hm;
	
	@BeforeTest
	public void preConditions() throws IOException, InterruptedException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		hm = new POHomePage(driver);
		MyExpliciteWait(hm.getHomePagePopUp());
		hm.getHomePagePopUp().click();		
	}
	
	@AfterTest
	public void tearDownOpenBrowsers(){
		driver.quit();
	}
	
	@Test(enabled=true)
	public void homePageText(){
		System.out.println("@homePageText: Home Page Screen : " + hm.getHomePageText().getText());
		Assert.assertTrue(hm.getHomePageText().isDisplayed());
	}
	
	@Test(enabled=true)
	public void homePageNavigationBar(){
		System.out.println("@homePageNavigationBar: In homePageNavigationBar Method");
		Assert.assertTrue(hm.getHomePageNavigationBar().isDisplayed());
	}
	
	@Test(enabled=true)
	public void homePageNavigationBarCount(){
		List<WebElement> navigationBars = hm.getHomePageNavigationBarCount();
		Iterator<WebElement> itr = navigationBars.iterator();
		System.out.println("@homePageNavigationBarCount: The number of navigation bar at Home Page are : " + navigationBars.size());
		while(itr.hasNext()){
			System.out.println(itr.next().getText());
		}
	}
	
}
