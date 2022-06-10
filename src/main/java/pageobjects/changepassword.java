package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class changepassword {

	public WebDriver driver ;
	By Email=By.xpath("//input[@id='input-email']");
	By Password= By.xpath("//input[@id='input-password']");
	By Login= By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
	By MYAccount= By.xpath("//body/div[1]/div[1]/aside[1]/div[1]/div[2]/a[1]");
	By PassWord= By.xpath("//body/div[1]/div[1]/aside[1]/div[1]/div[2]/a[3]");
	By password=By.xpath("//input[@id='input-password']");
	By PasswordConfirm= By.xpath("//input[@id='input-confirm']");
	By Continue= By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
	By sucessfull=By.xpath("//body/div[1]/div[1]");
	public changepassword(WebDriver driver) {
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
	public WebElement getMYAccount() {
		return driver.findElement(MYAccount);
	}
	public WebElement getPassWord() {
		return driver.findElement(PassWord);
		}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getPasswordConfirm() {
		return driver.findElement(PasswordConfirm);
	}
	public WebElement getContinue() {
		return driver.findElement(Continue);
	}
	public WebElement getsucessfull() {
		return driver.findElement(sucessfull);
	}
}
