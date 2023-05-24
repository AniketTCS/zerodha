package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class with_DDF {
public static void main(String[] args) throws Throwable {
	// create object of file class
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\AK.xlsx ");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	// set properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://kite.zerodha.com");
	// give wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	// maximize
	driver.manage().window().maximize();
	//  enter username
	String un = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
	// enter password
	String pwd = sh.getRow(2).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	//click on login button
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	//enter pin
	String pn = sh.getRow(2).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pn);
	//click on countinue button
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	//verify user id
	String expID = sh.getRow(0).getCell(2).getStringCellValue();
	String actID = driver.findElement(By.xpath("//span[text()='DPG458']")).getText();
	if(expID.equals(actID)) {
		System.out.println("tc is pass");
	}
	else {
		System.out.println("tc is fail");
	}
}
}
