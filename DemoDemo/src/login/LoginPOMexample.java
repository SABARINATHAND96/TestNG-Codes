package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectsModel.LoginPageObjectModel;

public class LoginPOMexample {
@Test
public void LoginPom(String Uname,String Pword) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver wakanda=new ChromeDriver();
		wakanda.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//create POM Objects
		//LoginPageObjectModel loginPageObjectsModel=new LoginPageObjectModel();
		
		PageFactory.initElements(wakanda,LoginPageObjectModel.class);
		
		LoginPageObjectModel.Username.sendKeys("standard_user");
		LoginPageObjectModel.Password.sendKeys("secret_sauce");
		LoginPageObjectModel.Submitb.click();
		
		
		
		
		
		
		
		
		
		
		/*
		 * wakanda.findElement(By.xpath("//*[@name='user-name']")).sendKeys(Uname);
		 * wakanda.findElement(By.xpath("//*[@name='password']")).sendKeys(Pword);
		 * wakanda.findElement(By.xpath("//*[@value='Login']")).click();
		 */
	}
}
