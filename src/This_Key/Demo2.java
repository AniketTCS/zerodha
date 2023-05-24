package This_Key;

public class Demo2 {//BLC
	byte b = 30 ;  // global variable
	public void test() {
		byte b = 60 ;// local variable
				System.out.println(b);
				System.out.println(this.b);
	}

}
