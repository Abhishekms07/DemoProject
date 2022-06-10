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
import resources.base;
public class Validateeditinformation extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{

		driver =initializeDriver();
		driver.get(prop.getProperty("url1"));
	}
	@Test
	public void editmyinformation() throws IOException
	{
		Editmyinformation e=new Editmyinformation(driver);

		e.getEmail().sendKeys("abhshek987@gmail.com");
		e.getPassword().sendKeys("AAAA");
		e.getLogin().click();
		e.getEditAccount().click();
		e.getFirstname().sendKeys("Abhi");
		e.getLastname().sendKeys("Raj");
		e.getemail().sendKeys("abhishekms@gmail.com");
		e.getTelephone().sendKeys("9448871016");
		e.getFax().sendKeys("ABB09");
		e.getContinue().click();
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null; 
	}


}








