package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest {//ULC
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions c =new ChromeOptions ();
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://kite.zerodha.com/");
		// maximize
		driver.manage().window().maximize();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//1st pom class
		 Kitelogin1page login1=new  Kitelogin1page(driver);
		 login1.enterUN();
		 login1.enterPWD();
		 login1.clickloginbtn();
		 //2nd pom class
		 Kitelogin2page login2=new Kitelogin2page (driver);
		 login2.enterPIN();
		 login2.clickcntBtn();
//		 //3rd pom class
//		 KiteHomePage hm= new KiteHomePage(driver);
//		 hm.verifyuserid();
//		 driver.close();
}
}
	