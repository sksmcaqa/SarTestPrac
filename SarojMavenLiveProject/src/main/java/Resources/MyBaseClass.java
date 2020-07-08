package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyBaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebElement element;
	
		
	public WebDriver initializeDriver() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Resources/UniversalData.properties");
		prop.load(fis);
		//mvn test -Dbrowser=chrome : Browser information from MAVEN command rather picking it from properties
		String browserName = System.getProperty("browser");
		
		//String browserName = prop.getProperty("browser");
		if(browserName.contains("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driverFiles/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless")){
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);			
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/driverFiles/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/driverFiles/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public void MyExpliciteWait(WebElement element) throws InterruptedException{
		while(element.isDisplayed()!=true){
			Thread.sleep(1000);
		}
	}
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException{
		//this.driver = driver;
		System.out.println(System.getProperty("user.dir"));
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"/reports/"+testCaseName+".png";
		System.out.println("destination path is : " + dest );
		FileUtils.copyFile(src, new File(dest));
		return dest;
	}
	

}
