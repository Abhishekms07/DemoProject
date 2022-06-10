package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import pageobjects.Registerpage;

import org.junit.runner.RunWith;
import resources.base;


@RunWith(Cucumber.class)
public class RegisterStepdefnition extends base {

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

	@And("^Click on my account link in home page to land on Register account page$")
	public void click_on_my_account_in_home_page_to_land_on_register_account_page() throws Throwable {
		Registerpage r=new Registerpage(driver); //driver.findElement
		r.getRegisterbutton().click(); 
		throw new PendingException();
	}

	@And("^ user enters (.+),(.+) ,(.+),(.+) ,(.+),(.+),(.+),(.+),(.+),(.+) ,(.+) ,(.+) ,(.+) $")
	public void user_enters_(String firstname, String lastname, String email, String telephone, String address1, String address2, String city, String postalcode, String country,  String Regionstate, String password, String confirmpassword) throws Throwable {
		Registerpage r=new Registerpage(driver);
		r.getFirstName().sendKeys("Raju");
		r.getLastName().sendKeys("Ravi");
		r.getEmail().sendKeys("abhishek07@gmail.com");
		r.getTelephone().sendKeys("8088774497");
		r.getFax().sendKeys("8tyu");
		r.getCompany().sendKeys("capgemini");
		r.getAddress1().sendKeys("Sri nilaya,no56");
		r.getAddress2().sendKeys("rajajinagara, bombay");
		r.getCity().sendKeys("Bombay");
		r.getPostcode().sendKeys("563002");
		r.getRegionstate().click();
		r.getCountry().click();
		r.getpassowrd().sendKeys("RaaJ@12345");
		r.getconfirmpassword().sendKeys("Raaj@12345");


		throw new PendingException();
	}

	@And("^Click on yes or no$")
	public void click_on_yes_or_no() throws Throwable {
		Registerpage r=new Registerpage(driver);
		r.getYes().click();
		throw new PendingException();
	}

	@And("^Click on  I have read and agree to the Privacy Policy$")
	public void click_on_i_have_read_and_agree_to_the_privacy_policy() throws Throwable {
		Registerpage r=new Registerpage(driver);
		r.getPrivacyPolicy().click();
		throw new PendingException();
	}

	@And("^Click on continue$")
	public void click_on_continue() throws Throwable {
		Registerpage r=new Registerpage(driver);
		r.getContinue().click();
		throw new PendingException();
	}
	@Then("^verify that user sucessfully regestried the account$")
	public void verify_that_user_sucessfully_regestried_the_account() throws Throwable {
		throw new PendingException();
	}


	@And("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
		throw new PendingException();
	}

}


