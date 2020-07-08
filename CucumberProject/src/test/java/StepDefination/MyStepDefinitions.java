package StepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CucumberJavaPkg.CucumberProject.Base;
import PageObject.CheckOutPage;
import PageObject.HomePage;
import PageObject.KartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base{
	//public WebDriver driver;
	HomePage hm;
	KartPage kp;
	CheckOutPage cp;
	
	
	@Given("^User in on GreenKart landing page$")
    public void user_in_on_greenkart_landing_page() throws Throwable {
      driver = getDriver();
      driver.get(prop.getProperty("url"));
	}
	
    @When("^User search for (.+) vegitable$")
    public void user_search_for_vegitable(String prodname) throws Throwable {
    	hm = new HomePage(driver);
    	hm.getSearch().sendKeys(prodname);
    	Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	hm =new HomePage(driver);
    	System.out.println(hm.getProduct().getText());
    	System.out.println(hm.getProduct().getText().contains(strArg1));
    	Assert.assertTrue(hm.getProduct().getText().contains(strArg1)); 
    	Thread.sleep(3000);
    }	
    	
   /* @Then("^Verify selected \"([^\"]*)\" items are displayed in check out screen$")
    public void verify_selected_something_items_are_displayed_in_check_out_screen(String strArg1) throws Throwable {
    	cp = new CheckOutPage(driver);
    	System.out.println(cp.getProduct().getText());
    	Assert.assertTrue(cp.getProduct().getText().contains(strArg1));
       	Thread.sleep(2000);   
    }*/

    @And("^Add items to kart$")
    public void add_items_to_kart() throws Throwable {
    	hm = new HomePage(driver);
    	hm.getProductIncrement().click();
    	hm.getAddtokart().click();
    	hm.getKartIcon().click();
        Thread.sleep(3000);
    }

    @And("^User proceed to check out for purchase$")
    public void user_proceed_to_check_out_for_purchase() throws Throwable {
    	kp = new KartPage(driver);
    	kp.getProceedToCheckout().click();
    	Thread.sleep(3000);
    }	
}
