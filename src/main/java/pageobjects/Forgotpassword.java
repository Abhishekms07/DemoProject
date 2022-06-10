package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpassword {

	public WebDriver driver ;
	By Email=By.xpath("//*[@id=\"input-email\"]");
	By CONTINUE= By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	
	public Forgotpassword(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmail() {
		return driver.findElement(Email);
		}
	public WebElement getContinue() {
		return driver.findElement(CONTINUE);
	}
	
}
