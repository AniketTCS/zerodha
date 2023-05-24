package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {//BLC
  //declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userid;

  // initialization
  public KiteHomePage(WebDriver driver) {
	  PageFactory.initElements( driver,this);
  }
  //utilization
  public void verifyuserid() {
	  String expID="DPG458";
	  String actID= userid.getText();
	  if(actID.equals(expID)) {
		  System.out.println("TC IS PASS");
	  }
	  else {
		  System.out.println("TC IS FAIL");
	  }
  }
  
}