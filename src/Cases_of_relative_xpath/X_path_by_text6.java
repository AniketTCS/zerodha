package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class X_path_by_text6 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		String exT="actiTIME - Enter Time-Track";
		Thread.sleep(2000);
		String acT=driver.getTitle();
		if(acT.equals(exT)) {
			System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
		}
	}

}
