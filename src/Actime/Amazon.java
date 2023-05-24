package Actime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    //use css selector(choice the mobile)
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobiles under 20000");
	    //click on search button
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	    
	   // driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("mobiles under 10000");
	  //  driver.findElement(By.cssSelector("input[id=\"nav-search-submit-button\"]")).click();
	}
}
