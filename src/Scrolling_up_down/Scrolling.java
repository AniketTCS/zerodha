package Scrolling_up_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c =new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.amazon.com");
	// typecast javascriptexecutor
//	JavascriptExecutor jse=(JavascriptExecutor)driver;
//	jse.executeScript("window.scrollBy(0,2000);");
//	Thread.sleep(3000);
//	jse.executeScript("window.scrollBy(0,-1000);");
	
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-1000);");
}
}
