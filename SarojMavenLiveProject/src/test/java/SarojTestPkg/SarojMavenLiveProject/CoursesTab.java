package SarojTestPkg.SarojMavenLiveProject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.POCourseNavigationTab;
import PageObjectModel.POHomePage;
import Resources.MyBaseClass;

public class CoursesTab extends MyBaseClass{

	public WebElement element;
	public WebDriver driver;
	POCourseNavigationTab cn;
	
	@BeforeTest
	public void preConditions() throws IOException, InterruptedException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		POHomePage hm = new POHomePage(driver);
		MyExpliciteWait(hm.getHomePagePopUp());
		hm.getHomePagePopUp().click();			
	}
	
	@AfterTest
	public void tearDownOpenBrowsers(){
		driver.quit();
	}
	
	@Test(enabled=true, priority=1)
	public void courseNavigationTab() throws InterruptedException{
		cn = new POCourseNavigationTab(driver);
		String barName = cn.getCourseNavigationTab().getText();
		if(barName.toLowerCase().equals("Courses".toLowerCase())){
			cn.getCourseNavigationTab().click();
			System.out.println("@courseNavigationTab: Navigated to courses Tab!");
		}
	}
	
	@Test(enabled=true,priority=2)
	public void allCoursesCount() throws InterruptedException{
		MyExpliciteWait(cn.getViewAllCourses());
		cn.getViewAllCourses().click();
		MyExpliciteWait(cn.getSearchCourse());
		List<WebElement> lst = cn.getCoursesCount();
		System.out.println("@allCoursesCount: Number Of courses in courses tab are : " + lst.size());
	}
	
	@Test(enabled=true, priority=3)
	public void searchCourse() throws InterruptedException{
		Assert.assertTrue(cn.getSearchCourse().isDisplayed());
		cn.getSearchCourse().sendKeys("PRA");
		System.out.println("@searchCourse: " + cn.getSearchedCourseName().getText());
	}
}
