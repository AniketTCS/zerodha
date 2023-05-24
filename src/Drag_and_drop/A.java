package Drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	// inspect 1st element and store in ele1
	WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	// inspect 2nd element and store in ele2
	WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	// object of Actions class
	Actions act= new Actions(driver);
	act.dragAndDrop(ele1, ele2).perform();
	
}
}
