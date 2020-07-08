package StepDefination;

import CucumberJavaPkg.CucumberProject.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before("@mobileTest")
	public void beforeMobileValidation(){
		System.out.println("MOBILE BEFORE VALIDATION:");
	}
	@After("@mobileTest")
	public void afterMobileValidation(){
		System.out.println("MOBILE AFTER VALIDATION:");
	}
	@Before("@webTest")
	public void beforeWebValidation(){
		System.out.println("WEB BEFORE VALIDATION:");
	}
	@After("@webTest")
	public void afterWebValidation(){
		System.out.println("WEB AFTER VALIDATION:");
	}

	@After("@RegressionTest")
	public void afterRegressionTest(){
		driver.close();
	}
	
	@After("@SmokeTest")
	public void afterSmokeTest(){
		driver.close();
	}
}
