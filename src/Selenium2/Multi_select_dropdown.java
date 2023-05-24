package Selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multi_select_dropdown {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		// open the application
		driver.get("file:///C:/Users/Admin/Documents/m.HTML");
		// inspect the dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='PARADISE']"));
		// to create object of select class
		Select s= new Select(dropdown);
		// check wheather  drop down is multiselectable or not
		if(s.isMultiple()) {
			System.out.println("given drop down is multiselectable");
		}
		else {
			System.out.println("it is not multiselectable");
		}
		// get size of options
		List<WebElement> allelements = s.getOptions();
		System.out.println(allelements.size());
		// get the text of all element
		for(int i=0;i<=allelements.size()-1;i++) {
			WebElement oneelement=allelements.get(i);
			String text = oneelement.getText();
			System.out.println(text);
		}
}
}