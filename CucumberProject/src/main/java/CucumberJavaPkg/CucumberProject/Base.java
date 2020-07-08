package CucumberJavaPkg.CucumberProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/CucumberJavaPkg/CucumberProject/globalData.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("browser"));
		//System.out.println(prop.getProperty("browser").equalsIgnoreCase("chrome"));
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driverFiles/chromedriver.exe");
			driver =  new ChromeDriver();
		}
		//System.out.println(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;		
	}
	
	
}
