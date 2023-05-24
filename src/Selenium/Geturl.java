package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.monster.com/");
	
	 //use get current url
	String link = driver.getCurrentUrl();
	System.out.println(link);
	
	// get tittle
	String title = driver.getTitle();
    System.out.println(title);
}
}
