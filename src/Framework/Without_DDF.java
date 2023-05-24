package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	// open application
	driver.get("https://kite.zerodha.com/");
	//maximize the browser
	driver.manage().window().maximize();
	// give global wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter user id
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	//enter password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
	//click on login button
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	// enter pin
	//driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
	// click on countinue button
	//driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	// verify user id
	String expID = "DPG458";
	String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	if(expID.equals(actID)) {
		System.out.println("both are same,tc is pass");
	}
	else {
		System.out.println("both are not same , tc is fail");
	}
	
}
}
