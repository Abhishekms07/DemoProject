package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import resources.base;
import pageobjects.Editmyinformation;


	@RunWith(Cucumber.class)
	public class EditinformationstepDefnition extends base {
		@Given("^initilize browser with chrome$")
	    public void initilize_browser_with_chrome() throws Throwable {
			 driver =initializeDriver();
	        throw new PendingException();
	    }
		@And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg2) throws Throwable {
			driver.get(strArg2);
	        throw new PendingException();
	    }
		 
		 @And("^enter (.+),  (.+)$")
		    public void enter_(String emailaddress, String password) throws Throwable {
			 Editmyinformation e=new Editmyinformation(driver);
			 e.getEmail().sendKeys("abhshek987@gmail.com");
			 e.getPassword().sendKeys("AAAA");
		        throw new PendingException();
		    }
		  @And("^Click on login$")
		    public void click_on_login() throws Throwable {
			  Editmyinformation e=new Editmyinformation(driver);
			  e.getLogin().click();
		        throw new PendingException();
		    }


	    @Then("^Click on Edit your information$")
	    public void click_on_edit_your_information() throws Throwable {
	    	Editmyinformation e=new Editmyinformation(driver);
	    	e.getEditAccount().click();
	        throw new PendingException();
	    }
	    @And("^enter (.+) and (.+)$")
	    public void enter_and(String telephone, String lastname) throws Throwable {
	    	Editmyinformation e=new Editmyinformation(driver);
	    	e.getFirstname().sendKeys("Abhi");
	    	e.getLastname().sendKeys("Raj");
	    	e.getemail().sendKeys("abhishekms@gmail.com");
	    	e.getTelephone().sendKeys("9448871016");
	    	e.getFax().sendKeys("ABB09");
	    	
	        throw new PendingException();
	    }
	    @And("^click on continue$")
	    public void click_on_continue() throws Throwable {
	    	Editmyinformation e=new Editmyinformation(driver);
	    	e.getContinue().click();
	        throw new PendingException();
	        
	    }


	    @Then("^verify you get(.+)$")
	    public void verify_you_get(String successyouraccounthasbeensuccessfullyupdated) throws Throwable {
	        throw new PendingException();
	    }

	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	}
	


