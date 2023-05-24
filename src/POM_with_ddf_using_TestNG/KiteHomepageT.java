package POM_with_ddf_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepageT {
	 //declaration
		@FindBy(xpath="//span[@class='user-id']")private WebElement userid;

	  // initialization
	  public KiteHomepageT(WebDriver driver) {
		  PageFactory.initElements( driver,this);
	  }
	  //utilization
	  public String verifyuserid() {
		  
		  String actID= userid.getText();
		  return actID;
}
}