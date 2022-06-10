package Uniform;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageobjects.Registerpage;
import resources.base;


public class Validateregisterpage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
		@BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url"));
		}
		@Test
		public void registerpage() throws IOException
		{
			
				 Registerpage r=new Registerpage(driver);
				 r.getFirstName().sendKeys("Raju");
			    	r.getLastName().sendKeys("Ravi");
			    	r.getEmail().sendKeys("abhishek16@gmail.com");
			    	r.getTelephone().sendKeys("9088774497");
			    	r.getFax().sendKeys("8tyu");
			    	r.getCompany().sendKeys("capgemini");
			    	r.getAddress1().sendKeys("Sri nilaya,no56");
			    	r.getAddress2().sendKeys("rajajinagarnagara, bombay");
			    	r.getCity().sendKeys("Bombay");
			    	r.getPostcode().sendKeys("563002");
			    	r.getRegionstate().click();
			    	r.getCountry().click();
			    	r.getpassowrd().sendKeys("Raaj@12345");
			    	r.getconfirmpassword().sendKeys("Raaj@12345");
			    	r.getYes().click();
			    	r.getPrivacyPolicy().click();
			    	r.getContinue().click();
			    	
			 }
		@AfterTest
public void teardown()		{
			 driver.close();
				driver=null;
			 


		}
}
