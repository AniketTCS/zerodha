package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Print_row {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("file:///C:/Users/Admin/Downloads/WebTable%20by%20ANKUSH.html");
	// print single row
	String row1 = driver.findElement(By.xpath("//table[@id='2244']//tr[1]")).getText();
	System.out.println(row1);
	//row2
	String row2 = driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
	System.out.println(row2);
//	
}
}
