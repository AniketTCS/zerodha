package POM_with_pagefac_ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kitelogintext {//ulc
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\AK.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://kite.zerodha.com/");
	// maximize
	driver.manage().window().maximize();
	// implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	// call 1st pom class
	Kitelogin1Page login1=new Kitelogin1Page(driver);
	String username = sh.getRow(0).getCell(2).getStringCellValue();
	login1.enterUN(username);
	
	String password = sh.getRow(2).getCell(0).getStringCellValue();
	login1.enterPWD(password);
	
	login1.clickloginbtn();
	
	//call 2nd pom class2
	Kitelogin2Page login2=new Kitelogin2Page(driver);
	String pinvalue = sh.getRow(2).getCell(2).getStringCellValue();
	login2.enterPIN(pinvalue);
	
	login2.clickcntBtn();
	
	//call home page
	Kitehomepage home=new Kitehomepage(driver);
	String expuserid = sh.getRow(0).getCell(0).getStringCellValue();
	home.verifyuserid(expuserid);
	driver.close();
	
}
}
