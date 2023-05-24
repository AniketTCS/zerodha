package Testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class B {
	@Test
	public void TC1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			ChromeOptions c= new ChromeOptions();
			c.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(c);
			driver.get("https://www.facebook.com/");
}
}