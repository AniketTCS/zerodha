package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin1page {
// step1 Declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement LOGINBTN;
	//step2 intializtion
	public Kitelogin1page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		//utilisation
		public void enterUN() {
			//UN.sendKeys("DPG458");
			//UN.sendKeys("OZ0294");
			UN.sendKeys("Dv1510");
		}
		public void enterPWD() {
			//PWD.sendKeys("Amol@1234");
			//PWD.sendKeys("aniket5621");
			PWD.sendKeys("Goal@123");
		}
		public void clickloginbtn() {
			LOGINBTN.click();
		}
	}

