package POM_with_pagefac_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin2Page {
	//Declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath="//button[text()='Continue ']")private WebElement cntBtn;
		
	// Inilization
		public Kitelogin2Page(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
	// utilisation
		public void enterPIN(String pinvalue) {
			PIN.sendKeys(pinvalue);
		}
		public void clickcntBtn() {
			cntBtn.click();
		}
}