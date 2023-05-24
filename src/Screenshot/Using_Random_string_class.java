package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;







public class Using_Random_string_class {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	
	// use random string class 
	String Random = RandomString.make();
	
	// typecast take screenshot interface
	TakesScreenshot ts=(TakesScreenshot)driver;// control space
	
	// use getscreenshotAS()
	File src = ts.getScreenshotAs(OutputType.FILE);
	// we have to store screenshot at particular destination create object of FILE class
	File dest = new File("C:\\Users\\Admin\\Desktop\\a\\"+Random+".jpg");
	// u have to transfer file source to destination
	Files.copy(src, dest);
}
}
