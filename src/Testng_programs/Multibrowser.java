package Testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {
	@Parameters("browsername")//annotation
	@Test
public void TC1(String browsername) {// paramertrized method
		WebDriver driver=null;// run time polymorphisum
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions  c= new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(c);
}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64");
			 driver=new FirefoxDriver();
		}
}
}