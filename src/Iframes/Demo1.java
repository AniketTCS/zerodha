package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(4000);
		// switch to 2 frame
		driver.switchTo().frame("iframeResult");//frame id
		// enter first name
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Aniket");
		// enter last name
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("jadhav");
		// click on submit button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
}
}