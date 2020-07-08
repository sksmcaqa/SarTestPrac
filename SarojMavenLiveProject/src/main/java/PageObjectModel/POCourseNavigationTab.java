package PageObjectModel;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POCourseNavigationTab {
	WebDriver driver;
	public POCourseNavigationTab(WebDriver driver){
		this.driver = driver;
	}
	
	private By courseNavigationTab = By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[2]");
	private By viewAllCourses = By.xpath("//a[contains(text(),'VIEW ALL COURSES')]");
	private By coursesCount = By.cssSelector(".col-xs-12.col-sm-6.col-md-4");
	private By searchCourse = By.cssSelector("#search-courses");
	private By searchedCourseName = By.xpath(".//a/div/div[2][contains(@title,'RPA')]");
	
	public WebElement getCourseNavigationTab(){
		return driver.findElement(courseNavigationTab);
	}
	
	public WebElement getViewAllCourses(){
		return driver.findElement(viewAllCourses);
	}
	
	public List<WebElement> getCoursesCount(){
		return driver.findElements(coursesCount);
	}

	public WebElement getSearchCourse(){
		return driver.findElement(searchCourse);
	}
	
	public WebElement getSearchedCourseName(){
		return driver.findElement(searchedCourseName);
	}
}
