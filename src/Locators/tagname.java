package Locators;

import javax.swing.table.AbstractTableModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	
	//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("admin");
	Thread.sleep(2000);
//	
//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager");
	Thread.sleep(2000);
//	
//	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
//	
//	String expT ="actiTIME - Enter Time-Track";
//	Thread.sleep(2000);
//	 String actT = driver.getTitle();
//	 if(actT.equals(expT)) {
//		 System.out.println("Home page is open TC is pass");
//	 }
//	 else {
//		 System.out.println("home page is not open, TC is fail");
//	 }
//	 
	String expT="actiTIME - Enter Time-Track";
	Thread.sleep(2000);
	String acT=driver.getTitle();
	if(acT.equals(expT)) {
		System.out.println("HOME PAGE IS OPEN");
	}
	else {
		System.out.println("home page is not open,TC is fail");
	}
}
}