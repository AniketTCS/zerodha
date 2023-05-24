package POM_with_pagefac_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage {
	  //declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userid;
		
	//intialization
	public Kitehomepage(WebDriver driver) {
    PageFactory.initElements( driver,this);
		  }
	// utilization
	public void verifyuserid(String expID) {
		String actID= userid.getText();
		if(actID.equals(expID)) {
			System.out.println("TC IS PASS");
		}
		else {
			System.out.println("TC IS FAIL");
		}
	}
}
