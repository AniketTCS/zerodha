package Selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamics_dropdown_Autosuggestions {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		
		// enter kgf in google
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
		Thread.sleep(3000); // it is manadatory
		
		// inspect elements
//		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	 List<WebElement> alloptions	=driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]/span"));
		
		// use for each loop
		for(WebElement oneoption:alloptions) {
			String text=oneoption.getText();
			System.out.println(text);
			
			//if(text.contains("kgf 2 collection")) {
			//	oneoption.click();
			//}
			
			if(text.contains("kgf 3")) {
				oneoption.click();
			}
		}
//		
}
}