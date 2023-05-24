package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail_1 {
	@ Test
public void TC1(){
		Reporter.log("tc is running",true);
		Assert.fail();
		System.out.println("im after failure");
	
}
	@Test
	public void Tc2() {
		Reporter.log(" tc2 is pass");
	}
}
