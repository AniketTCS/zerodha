package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo4 {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("moneyiframe");
		// take 1st element of frame
		String text = driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("SPORTS")).click();
		
}
}