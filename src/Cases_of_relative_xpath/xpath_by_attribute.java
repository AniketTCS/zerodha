package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath_by_attribute {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.actitime.com/login.do");
		
//		// Enter Un
//		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
//		
//		// Enter PWD
//		driver.findElement (By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
//
//		//click on login button(x path by text)
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//	
//		String expT ="actiTIME - Enter Time-Track";
//		Thread.sleep(2000);
//		 String actT = driver.getTitle();
//		 if(actT.equals(expT)) {
//			 System.out.println("Home page is open TC is pass");
//		 }
//		 else {
//			 System.out.println("home page is not open, TC is fail");
//		 }
		
		String expT = "actiTIME - Enter Time-Track";
		Thread.sleep(2000);
		String acT=driver.getTitle();
		if(acT.equals(expT)) {
			System.out.println("home page is open TC is pass");
		}
		else {
			System.out.println("home page is not open tc is fail");
		}
	}
}
