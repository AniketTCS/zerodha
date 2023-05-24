package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class print_coloumn {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(c);
		driver.get("file:///C:/Users/Admin/Downloads/WebTable%20by%20ANKUSH.html");
		for(int i=1;i<=5;i++) {
			if(i==1) {
				Thread.sleep(3000);
				String str1 = driver.findElement(By.xpath("//table[@id='2244']//tr["+i+"]/th[1]")).getText();
				System.out.println(str1);
			}
		else {
				Thread.sleep(3000);
				String str2 = driver.findElement(By.xpath("//table[@id='2244']//tr["+i+"]/td[1]")).getText();
				System.out.println(str2);
			}
		}
	}
}
