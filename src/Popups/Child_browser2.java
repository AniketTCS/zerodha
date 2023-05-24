package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Child_browser2 {
private static int newArraylist;

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c =new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.flipkart.com/");
	// click on cancel button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	// search for mobiles
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	// click on serch button
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	// click on first mobile so new child window open
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//by default selenium control should be on main window we have to switch it from main window to child
	Thread.sleep(3000);
	Set<String> allws = driver.getWindowHandles();
	
	//use arraylist to store all windows
	ArrayList<String> al = new ArrayList<String>(allws);
	String cw=al.get(1);
	System.out.println(cw);// print child window session id
	// to print main window session id
	String mainwin = al.get(0);
	System.out.println( mainwin);
	// switch to main window
	Thread.sleep(3000);
	driver.switchTo().window(al.get(0));
	// for confirmation gettitle
	String title = driver.getTitle();
	System.out.println(title);
}
}
