package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin2page {//BLC
	//Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement cntBtn;
     //initialization
	public Kitelogin2page(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//utilisation
	public void enterPIN() {
		//PIN.sendKeys("171992");
		//PIN.sendKeys("300394");
		PIN.sendKeys("959594");
	}
	public void clickcntBtn() {
		cntBtn.click();
	}
}
