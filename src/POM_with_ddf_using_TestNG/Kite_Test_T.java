package POM_with_ddf_using_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.KiteHomePage;
import POM.Kitelogin1page;
import POM.Kitelogin2page;

public class Kite_Test_T {
	// declare all  usefull members as global
	Sheet sh;
	WebDriver driver;
	KiteLogin1pageT login1;
	KiteLogin2pageT login2;
	KiteHomepageT hm;
	@BeforeClass
public void openbrowser() throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\AK.xlsx ");
		 sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		// maximize
		driver.manage().window().maximize();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// all objects of Pom class
		 login1=new  KiteLogin1pageT(driver);
		  login2=new KiteLogin2pageT (driver);
		  hm= new KiteHomepageT(driver);
}
	@BeforeMethod 
	public void loginToApp() {
		//enter un
		String username= sh.getRow(0).getCell(0).getStringCellValue();//DPG458
		login1.enterUN(username);
		//enter password
		String password = sh.getRow(2).getCell(0).getStringCellValue();
		login1.enterPWD(password);
		//click on login btn
		login1.clickloginbtn();
		// enter pin
		String pinvalue = sh.getRow(2).getCell(2).getStringCellValue();
		login2.enterPIN(pinvalue);
		//click on count btn
		login2.clickcntBtn();
		
	}
	@Test
	public void verifyuserID() {
		Reporter.log("running verify userid",true);
		String actID=hm.verifyuserid();
		String expID = sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actID, expID,"both are diffrent tc is failed");
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the app",true);
	}
}
