package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_by_text4 {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
      
		//enter un
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		// click on login button bt text()
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
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
