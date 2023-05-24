package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Demo {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions c =new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		// enter customer id 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		// click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// switch from main page to popup
		 Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		// click on ok button
		//alt.accept();
		// click on cancel button
		//alt.dismiss();
		// we get text of popup
		String text = alt.getText();
		System.out.println(text);
}
}