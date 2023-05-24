package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxi_mini {
public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
		
		// maximize the browser
		driver.manage().window().maximize();
	Thread.sleep(5000);
		// minimize the browser
		driver.manage().window().minimize();
		
		// note in sel(3version there is no minimize but from sel 4version onwards it is implemented 
		
}
}
