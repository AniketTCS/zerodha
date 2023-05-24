package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Meshoo_screenshot {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.meesho.com/");
	driver.manage().window().maximize();
	
	//typecast takescreenshot interface
	TakesScreenshot ts=(TakesScreenshot)driver;
	// use get screenshot() 
	File src = ts.getScreenshotAs(OutputType.FILE);
	// we have to store screenshot at particular destination so create object of File class
	File dest=new File("C:\\Users\\Admin\\Desktop\\a\\Meshoo.jpg");
	// transfer file source to destination(src to dest)
	Files.copy(src, dest);
	
}
}
