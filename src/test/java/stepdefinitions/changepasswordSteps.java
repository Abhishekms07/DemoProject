package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.Editmyinformation;
import pageobjects.changepassword;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class changepasswordSteps extends base{
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

    @And("^enter (.+),  (.+)$")
    public void enter_(String emailaddress, String password) throws Throwable {
    	changepassword e=new changepassword(driver);
		 e.getEmail().sendKeys("abhshek987@gmail.com");
		 e.getPassword().sendKeys("AAAA");
        throw new PendingException();
    }

    @And("^Click on login $")
    public void click_on_login() throws Throwable {
    	changepassword e=new changepassword(driver);
    	e.getLogin().click();
        throw new PendingException();
    }

    @And("^Click on My Account$")
    public void click_on_my_account() throws Throwable {
    	changepassword e=new changepassword(driver);
    	e.getMYAccount().click();
    	
        throw new PendingException();
    }

    @And("^click password$")
    public void click_password() throws Throwable {
    	changepassword e=new changepassword(driver);
    	e.getPassWord().click();
        throw new PendingException();
    }
    
    @And("^enter (.+) and (.+)$")
    public void enter_and(String Password, String PasswordConfirm) throws Throwable {
    	changepassword e=new changepassword(driver);
    	e.getpassword().sendKeys("RAJ&123");
    	e.getPasswordConfirm().sendKeys("RAj&123");
    }

    @And("^click on continue$")
    public void click_on_continue() throws Throwable {
    	changepassword e=new changepassword(driver);
    	e.getContinue().click();
        throw new PendingException();
    }
    @Then("^verify you get(.+)$")
    public void verify_you_get(String successyouraccounthasbeensuccessfullyupdated) throws Throwable {
        throw new PendingException();
    }

    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
        throw new PendingException();
    }

}

