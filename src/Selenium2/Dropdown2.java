package Selenium2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co) ;
	
	//open the browser
	driver.get("C:/Users/Admin/Documents/.HTML");
	
	//inspect the dropdown
	WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"GoodLuck\"]"));
	
	//create object of select class
	Select s= new Select(dropdown);
	
	//use select meythod
	//s.selectByIndex(5);
	s.selectByValue("a");
	s.selectByVisibleText("Biryani");
	
	//get size of element
  List<WebElement> allelement = s.getOptions();
  System.out.println(allelement.size());
  
  //get text of all element
  for(int i=0;i<=allelement.size()-1;i++) {
	 WebElement oneelement = allelement.get(i);
	String text = oneelement.getText();
	System.out.println(text);
  }
	
}
}
