package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserPassNotOk {

	@Test
	@Parameters({"Username","Password"})
	public void UserPsssNotokk(String Uname,String Pword) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver wakanda=new ChromeDriver();
		wakanda.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		wakanda.findElement(By.xpath("//*[@name='user-name']")).sendKeys(Uname);
		wakanda.findElement(By.xpath("//*[@name='password']")).sendKeys(Pword);
		wakanda.findElement(By.xpath("//*[@value='Login']")).click();
		


		
	}
	
	
	
	
	
}
