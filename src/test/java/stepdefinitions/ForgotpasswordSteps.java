package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.Forgotpassword;
import pageobjects.loginpage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class ForgotpasswordSteps extends base {

	    @Given("^initilize browser with chrome$")
	    public void initilize_browser_with_chrome() throws Throwable {
	    	driver =initializeDriver();
	        throw new PendingException();
	    }

	    @And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	        throw new PendingException();
	    }

	    @And("^enter (.+)$")
	    public void enter(String emailaddress) throws Throwable {
	    	Forgotpassword m= new Forgotpassword(driver);
	    	m.getEmail().sendKeys("abhishekms1997@gmail.com");
	        throw new PendingException();
	    }

	    @And("^click on CONTINUE button$")
	    public void click_on_continue_button() throws Throwable {
	    	Forgotpassword m= new Forgotpassword(driver);
	    	m.getContinue().click();
	        throw new PendingException();
	    }
	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }
	}

