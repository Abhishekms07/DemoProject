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
	import pageobjects.Editmyinformation;
import pageobjects.changepassword;
import resources.base;
	public class validateChangepassword extends base {
		
		
		 public static Logger log =LogManager.getLogger(base.class.getName());
		 
		 @BeforeTest
		 public void initialize() throws IOException
			{
			
				 driver =initializeDriver();
				 driver.get(prop.getProperty("url1"));
			}
		 @Test
		 public void Changepassword()throws IOException{
					 
				 changepassword e=new changepassword(driver);
			     
			     e.getEmail().sendKeys("abhshek987@gmail.com");
				 e.getPassword().sendKeys("AAAA");
				 e.getLogin().click();
				 e.getMYAccount().click();
				 e.getPassWord().click();
				 e.getpassword().sendKeys("RAJ&123");
				 e.getPasswordConfirm().sendKeys("RAJ&123"); 
			   e.getContinue().click();
		 }
		 @AfterTest
		 public void teardown() {
			 
			    driver.close();
				driver=null; 
			 
				 
					 
				 }
		 

}
