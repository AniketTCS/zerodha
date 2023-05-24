package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Demo2 {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions c =new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
//		// click on confirm alert box
//		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
//		//switch to main page of popup
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(3000);
//		// click on ok button
//		alt.accept();
		
		// click on prompt alert box
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		//switch to main page of popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		// write text in text bar
		alt.sendKeys("Yes");
		// click on ok button
		alt.accept();
}
}