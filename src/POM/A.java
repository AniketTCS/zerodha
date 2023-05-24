package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A {//How stale element reference exception generted
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.google.com");
		
		//WebElement textfield = driver.findElement(By.xpath("//input[@name='q']"));
		WebElement textfield = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		textfield.sendKeys("indian movie");
		driver.navigate().refresh();
		textfield.sendKeys("Sirat");
	}

}
