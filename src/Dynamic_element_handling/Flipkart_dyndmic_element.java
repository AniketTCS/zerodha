package Dynamic_element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart_dyndmic_element {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	//open url
	driver.get("https://www.flipkart.com/");
	// click on cancel button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	// search mobiles under 2000
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles under 2000",Keys.ENTER);
	// navigate to dynamic element(mak sure that ur taking class)
	Thread.sleep(3000);
	String review1 = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
	System.out.println(review1);
	
	// using descendant(optional)
	String review2 = driver.findElement(By.xpath("(//div[@class='col col-7-12']/descendant::span)[6]")).getText();
	System.out.println(review2);
}
}
