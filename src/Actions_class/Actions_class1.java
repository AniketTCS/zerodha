package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_class1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c =new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.google.com/");
	
	// inspect targate element and store in gmail
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	// create object of Actions class
	Actions act=new Actions(driver);
	
	// methods in Actions class
	//>>>1 movetoelement()
	//act.moveToElement(gmail).perform();
	
	//>>2 right click(contextclick)
	//act.moveToElement(gmail).contextClick().perform();
	
	//>>3 left click/click()
	//act.moveToElement(gmail).click().perform();
	
	//>>4 double click()
	//act.moveToElement(gmail).doubleClick().perform();
	
	// how to perform 3 action in single statement
	act.moveToElement(gmail).contextClick().doubleClick().build().perform();
}
}
