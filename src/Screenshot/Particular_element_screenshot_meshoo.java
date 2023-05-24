package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Particular_element_screenshot_meshoo {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.amazon.in/");
	
	// for taking screenshot of particular element-inspect it and store in referance variable
	WebElement Mesh = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	File src = Mesh.getScreenshotAs(OutputType.FILE);
	//store to destination
	File dest=new File("C:\\Users\\Admin\\Desktop\\a\\Amazon2.jpg");
	//source to destination
	Files.copy(src, dest);
}
}
