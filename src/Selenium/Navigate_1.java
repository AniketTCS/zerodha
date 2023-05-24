package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_1 {
public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in/");
	
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
}
}
