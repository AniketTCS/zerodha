package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popups {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		// create object of browser setting class
		ChromeOptions c = new ChromeOptions();
		// call addArgument method of browser setting class
		//c.addArguments("--disable-notifications");
		c.addArguments("--remote-allow-origins=*");
		// pass ref variable in chromedriver constructor
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.hdfc.com");
}
}