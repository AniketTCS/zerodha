package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disabled_TC_using_suite {
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
		}
}
