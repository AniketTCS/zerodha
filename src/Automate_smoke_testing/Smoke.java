package Automate_smoke_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smoke {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //login page
	    String expT="actiTIME - Login";
	    driver.get("https://demo.actitime.com/login.do");
	    String actT = driver.getTitle();
	    if(expT.equals(actT)) {
	    	System.out.println("test step is pass");
	    }
	    else {
	    	System.out.println("test step is fail");
	    }
	    //home page
	    //enter un
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	    //enter pwd
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    //click on login btn
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    //exp title of home page
	    String expTH="actiTIME - Enter Time-Track";
	    //actual title
	    Thread.sleep(3000);
	    String actTH = driver.getTitle();
	    if(actTH.equals(expTH)) {
	    	System.out.println("test step is pass");
	    	
	    }
	    else {
	    	System.out.println("test step is fail");
	    }
	    //crete user
	    driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("Ankush");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).clear();
	    
}
}
