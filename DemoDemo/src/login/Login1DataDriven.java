package login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login1DataDriven {
	
	WebDriver wakanda;
	
	
	
String[][] data=null;
		
	
	@DataProvider(name="LoginData")
	public String[][] LoginDataProvider() throws BiffException, IOException{
	
		data=getExcelData();
	return data;	
	
}
	
	
	public String[][] getExcelData() throws BiffException, IOException {
		
		FileInputStream excel=new FileInputStream("C:\\Users\\SABARINATHAN D\\Desktop\\TestData.xls");
		
		Workbook woorkBook=Workbook.getWorkbook(excel);
		
		Sheet wookSheet=woorkBook.getSheet(0);
		
		int rowcounts=wookSheet.getRows();
		
		int coulmnCounts=wookSheet.getColumns();

		String testData[][]=new String[rowcounts-1][coulmnCounts];  
		//why we set value i=1 ,we didn't need header, so I value 1(It's a RowCount)
		//why we set value j=0 ,column havn't header, so I value 0(It's a ColumnCount)
		for (int i = 1; i < rowcounts; i++) {
			for (int j = 0; j < coulmnCounts; j++) {
			//testdata[i-1] is 2-D array structure 
				//first getCell content
				//then store testData 2-D array
				
			testData[i-1][j]=wookSheet.getCell(j, i).getContents();	
				
			}
			
		}
	//return testdata values getExcelData()
	return testData;
	}
	
	@Test(dataProvider = "LoginData")
	public void getExcelData(String Uname,String Pword) throws InterruptedException {
		wakanda.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		wakanda.findElement(By.xpath("//*[@name='user-name']")).sendKeys(Uname);
		wakanda.findElement(By.xpath("//*[@name='password']")).sendKeys(Pword);
		wakanda.findElement(By.xpath("//*[@value='Login']")).click();
	}
	
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		wakanda=new ChromeDriver();
	}
	
	@AfterTest
	public void aftertest() {
		
		wakanda.quit();
	}
	
	
}
