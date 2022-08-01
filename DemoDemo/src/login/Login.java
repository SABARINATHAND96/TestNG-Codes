package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
String[][] data={
		{"standard_user","secret_sauc"},
		{"standard_usr","secret_sauce"},
		{"standard_use","secret_sauc"},
		{"standard_user","secret_sauce"},
		
	};
	@DataProvider(name="LoginData")
	public String[][] LoginDataProvider(){
	
	return data;	
}

	@Test(dataProvider = "LoginData")
	public void UserPassOk(String Uname,String Pword) throws InterruptedException {
		
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
