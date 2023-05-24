package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_class {
	@Test
public void TC1() {
	Reporter.log("running TC1",true);
	String expR="Hi";
	String actR="bye";
	// Object of soft assert class
	SoftAssert s=new SoftAssert();
	s.assertEquals(expR, actR);// Verification 1
	System.out.println("i am after failed verification");
	// mandatory
	s.assertAll();
}
	@Test
	public void TC2() {
		Reporter.log("hi");
	}
}
