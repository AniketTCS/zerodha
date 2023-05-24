package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class para_bank {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		
		driver.findElement(By.xpath("//a[@ href='http://www.parasoft.com/jsp/products.jsp']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gtranslate_selector']"));
		
		Select s= new Select(dropdown);
		
		s.selectByVisibleText("Français");
		s.selectByValue("en|en");
		s.selectByIndex(3);
}
}