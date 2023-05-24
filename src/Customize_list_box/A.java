package Customize_list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.facebook.com/");
	
	// click on create new account button
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	//select list box of month and save in month
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	// create object of Actions class
	Actions act=new Actions(driver);
	// click on month
	Thread.sleep(3000);
	act.click(month).perform();
	// move upword
	Thread.sleep(3000);
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	// move downword
	act.sendKeys(Keys.ARROW_DOWN).perform();
	// select top most element
	act.sendKeys(Keys.HOME).perform();
	// click on element
	act.sendKeys(Keys.ENTER);
}
}
