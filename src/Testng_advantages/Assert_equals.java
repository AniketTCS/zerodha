package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
	@Test
public void TC1() {
	Reporter.log("TC1 is running",true);
	String expR="Aniket";
	String actR="Aniket";
	Assert.assertEquals(expR, actR);
}
}
