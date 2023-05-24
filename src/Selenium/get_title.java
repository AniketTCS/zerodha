package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class get_title {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.google.com/");
	
//	//gettittle()
	 String expT = "Google";
	 String actT = driver.getTitle();
	 if(actT.equals(expT)) {
		 System.out.println(" test case is pass,expT is match with actT");
	 }
	 else {
		 System.out.println("test case fail");
	 }
	
}
}
