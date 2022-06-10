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
import pageobjects.loginpage;
import resources.base;
public class Validateloginpage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url1"));
		}
	 @Test
	 public void Loginpage() throws IOException{
		 
			 loginpage n= new loginpage(driver);
			 n.getEmail().sendKeys("abhishekmsgowda1997@gmail.com");
			 n.getPassword().sendKeys("Abhi@52892");
			 n.getLogin().click();
	 }
	 @AfterTest
	 public void teardown() {
	 			driver.close();
				driver=null;
		}
}