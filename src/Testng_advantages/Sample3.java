package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void  TC7() {
		Reporter.log("running TC7", true);
	}
		@Test
		public void  TC8() {
			Reporter.log("running TC8", true);
		}
		@Test
		public void  TC9() {
			Reporter.log("running TC9", true);
		}
}
