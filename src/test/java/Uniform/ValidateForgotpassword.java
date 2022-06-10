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
import pageobjects.Forgotpassword;
import resources.base;
public class ValidateForgotpassword extends base{
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
		{
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url2"));
		}
	 @Test
	 public void forgotpassword() throws IOException
	 {
			 Forgotpassword m= new Forgotpassword(driver);
			 m.getEmail().sendKeys("abhishekms1997@gmail.com");	
			 m.getContinue().click();
	 }
	 @AfterTest
	 public void teardown() {
			 driver.close();
				driver=null;
		}
}




