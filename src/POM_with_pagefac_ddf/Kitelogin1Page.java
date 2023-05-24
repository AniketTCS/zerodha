package POM_with_pagefac_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin1Page {
// step1 declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement loginbtn;

	// step2 initialisation
	public Kitelogin1Page(WebDriver driver) {
		PageFactory.initElements( driver,this);
}
	// utilization
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickloginbtn() {
		loginbtn.click();
	}
}