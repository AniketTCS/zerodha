package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_by_group_index {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.actitime.com/login.do");
		
//		//enter un
//		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
//		
//		// enter pwd
//		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
//		
//		// click on login button
//		driver.findElement(By.xpath("(//div)[13]")).click();
		driver.findElement(By.xpath("(//div)[13]")).click();
//		
  	String expT ="actiTIME - Enter Time-Track";
		Thread.sleep(2000);
		 String actT = driver.getTitle();
		 if(actT.equals(expT)) {
			 System.out.println("Home page is open TC is pass");
		 }
		 else {
			 System.out.println("home page is not open, TC is fail");
		 }
}
}