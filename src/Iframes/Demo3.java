package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3 {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		// get url
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		// maximize browser
		driver.manage().window().maximize();
		
//		// switch to first frame
		driver.switchTo().frame("packageListFrame");
		//take 1st element of frame
		String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		// switch to 2nd frame
		driver.switchTo().defaultContent(); // it will move from child to main web page
		driver.switchTo().frame("packageFrame");
		// take 1st element of 2 nd frame
		String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		
		//switch to 3rd frame
		driver.switchTo().defaultContent();// it will move 2nd to main web page
		driver.switchTo().frame("classFrame");
		// take 1st element of 3rd web page 
		String text2 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
}
}