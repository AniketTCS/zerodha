package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c =new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("file:///C:/Users/Admin/Downloads/WebTable%20by%20ANKUSH.html");
	// print student name
	String stna = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	System.out.println(stna);
	// print sachin
	String schn = driver.findElement(By.xpath("//table[@id='2244']//td[2]")).getText();
	System.out.println(schn);
	// print sngali
	String san = driver.findElement(By.xpath("(//table[@id='2244']//td)[9]")).getText();
	System.out.println(san);
	//using descendant
	String sang = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[9]")).getText();
	System.out.println(sang);
	// print shilpa
	String shi = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
	System.out.println(shi);
}
}
