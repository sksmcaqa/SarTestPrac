package StepDefination;

import java.util.List;

import org.junit.runner.RunWith;

import CucumberJavaPkg.CucumberProject.Base;
import PageObject.CheckOutPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class stepDefination extends Base{
	public CheckOutPage cp;

    @Given("^User is in login page$")
    public void user_is_in_login_page() throws Throwable {
        System.out.println("User is in Login screen");
    }

    @When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
       System.out.println("Login with , Username: " + strArg1 + " , Password: " + strArg2);
    }

    @Then("^Home page is displaying$")
    public void home_page_is_displaying() throws Throwable {
        System.out.println("Home screen is displaying");
    }

    @And("^Cards information diaplying are \"([^\"]*)\"$")
    public void cards_information_diaplying_are_something(String strArg1) throws Throwable {
       System.out.println("cards are displayed : " + strArg1);
    }
    
    @When("^User sign up with below details$")
    public void user_sign_up_with_below_details(DataTable data) throws Throwable {
       List<List<String>> lst = data.asLists();
       System.out.println(lst.get(0).get(0));
       System.out.println(lst.get(0).get(1));
       System.out.println(lst.get(0).get(2));
       System.out.println(lst.get(0).get(3));
       System.out.println(lst.get(0).get(4));	
    }

    @When("^User login with multiple data, username (.+) and password (.+)$")
    public void user_login_with_multiple_data_username_and_password(String username, String password) throws Throwable {
       System.out.println("logged in with : "+ username+" , and password : "+password);
    }

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("browser validated");
    }

    @When("^Browser is trigerred$")
    public void browser_is_trigerred() throws Throwable {
       System.out.println("browser trigerred");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("browser started");
    }

    @Then("^Verify selected (.+) items are displayed in check out screen$")
    public void verify_selected_items_are_displayed_in_check_out_screen(String prodname) throws Throwable {
    	cp = new CheckOutPage(driver);
    	System.out.println(cp.getProduct().getText());
    	Assert.assertTrue(cp.getProduct().getText().contains(prodname));
       	Thread.sleep(3000); 
    }
    
}