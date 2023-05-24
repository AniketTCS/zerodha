package Dynamic_element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Corona_virus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
			
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.worldometers.info/coronavirus/country/uk");
	//get the text of recoverd cases
	String recover = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();
	System.out.println("Total recover:"+recover);
	
	//get the text of deths
	String deths = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[2]")).getText();
	System.out.println("Total deths:"+deths);
	//get the test of corona virus castes
	String cases = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
	System.out.println("Total cases:"+cases);
}
}
