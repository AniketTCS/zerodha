package POM_with_ddf_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1pageT {
// STEP 1 declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement LOGINBTN;
	//step2 intializtion
	public KiteLogin1pageT(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		//utilisation
		public void enterUN(String username) {
			UN.sendKeys(username);
		}
		public void enterPWD(String password) {
			PWD.sendKeys(password);
		}
		public void clickloginbtn() {
			LOGINBTN.click();
		}
}
