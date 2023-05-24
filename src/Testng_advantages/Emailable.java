package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable {
	@Test
	public void TC() {
		Reporter.log("HI", true);
	}

}
