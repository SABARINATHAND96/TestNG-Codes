package pageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectModel {

	
	@FindBy(xpath = "//*[@name='user-name")
	public static WebElement Username;
	
	@FindBy(xpath = "//*[@name='password']")
	public static WebElement Password;

	@FindBy(xpath = "//*[@value='Login']")
	public static WebElement Submitb;

	
	
	
	
			// username , passsword, submit
	
	
			/*
			 * static public WebElement Username(WebDriver wakanda) {
			 * 
			 * return wakanda.findElement(By.xpath("//*[@name='user-name']")); }
			 * 
			 * 
			 * static public WebElement Password(WebDriver wakanda) {
			 * 
			 * return wakanda.findElement(By.xpath("//*[@name='password']")); }
			 * 
			 * static public WebElement Submitb(WebDriver wakanda) {
			 * 
			 * return wakanda.findElement(By.xpath("//*[@value='Login']")); }
			 */
	
	
	
	
	
	
	
	
	
	
	
}
