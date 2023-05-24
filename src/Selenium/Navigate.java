package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();//clt+space
	// navigate
	driver.navigate().to("https://www.google.com/");
    Thread.sleep(3000);
    driver.navigate().to("https://www.amazon.in/");
    // backward()
    driver.navigate().back();
    Thread.sleep(3000);
    // forward()
    driver.navigate().forward();
    Thread.sleep(3000);
    // refresh()
    driver.navigate().refresh();
    // close....>> it is used to close current browser
    driver.close();
    // quit
    driver.quit();
}
}
