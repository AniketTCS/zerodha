package Testng_advantages;



import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTC {
	@Test
	public void  TC1() {
		Reporter.log("running TC1", true);
	}
		@Test
		public void  TC2() {
			Reporter.log("running TC2", true);
		}
		@Test 
		public void  TC3() {
			Reporter.log("running TC3", true);
			Assert.fail();
		}
}
