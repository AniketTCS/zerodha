package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Child_browser_1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c =new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.flipkart.com/");
	// click on cancel button
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 // search mobiles
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	 // click on search button
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 Thread.sleep(3000);
	// click on first mobile
	 driver.findElement(By.xpath("//div[@class=\"_4rR01T\"][1]")).click();
	 //by default sselenium control should be on main window we have switch it from main window to child
	Set<String> allws = driver.getWindowHandles();
	for(String singlewin:allws) {
		driver.switchTo().window(singlewin);
	}
    Thread.sleep(3000);
  //get the text of child for our confirmation
String expT="SAMSUNG Galaxy F04 (Opal Green, 64 GB)  (4 GB RAM)";
String acT= driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();	
System.out.println(acT);
Thread.sleep(3000);
//verify the child window handle or not
if(acT.equals(expT)) {
	System.out.println("child window is handles and test case is pass");
}
	else {
		System.out.println("test case is fail");
	}
//	
}
}

