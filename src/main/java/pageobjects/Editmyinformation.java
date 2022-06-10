package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



	public class Editmyinformation {
		public WebDriver driver ;
		
		By Email=By.xpath("//input[@id='input-email']");
		By Password= By.xpath("//input[@id='input-password']");
		By Login= By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
		By EditAccount= By.xpath("//a[contains(text(),'Edit Account')]");
		By Firstname=By.xpath("//input[@id='input-firstname']");
		By Lastname=By.xpath("//input[@id='input-lastname']");
		By email=By.xpath("//input[@id='input-email']");
		By Telephone=By.xpath("//input[@id='input-telephone']");
		By Fax=By.xpath("//input[@id='input-fax']");
		By Continue= By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
		By sucessfull=By.xpath("//body/div[1]/div[1]");
		
	public Editmyinformation(WebDriver driver) {
			this.driver=driver;
		}
	

	public WebElement getEmail() {
		return driver.findElement(Email);
		}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getLogin() {
		return driver.findElement(Login);
	}
	public WebElement getEditAccount() {
		return driver.findElement(EditAccount);
	}
	public WebElement getFirstname() {
		return driver.findElement(Firstname);
	}
	public WebElement getLastname() {
		return driver.findElement(Lastname);
	}
	public WebElement getemail() {
		return driver.findElement(email);
	}
	public WebElement getTelephone() {
		return driver.findElement(Telephone);
	}
	public WebElement getFax() {
		return driver.findElement(Fax);
	}
	public WebElement getContinue() {
		return driver.findElement(Continue);
	}
	public WebElement getsucessfull() {
		return driver.findElement(sucessfull);
	}

	}

	
	



