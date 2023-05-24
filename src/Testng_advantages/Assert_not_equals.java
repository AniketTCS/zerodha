package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_not_equals {
	@Test
public void TC2() {
	Reporter.log("running TC2",true);
	String expR="Aniket";
	String actR="Anuja";
	Assert.assertNotEquals(expR, actR);
}
}
