package Method;

public class static_call_from_sameclass {// class body open
	public static void main(String[] args) {// main method body open
		m4();//method calling statement
		m3();
		m2();
		m1();
		
	}// main method body close
	
	public static void m1() {//regular method body open
		System.out.println("running from m1");
	}// regular method body closed
	
	public static void m2() {//regular method body open
		System.out.println("running from m2");
	}// regular method body closed
	
	public static void m3() {//regular method body open
		System.out.println("running from m3");
	}// regular method body closed

	public static void m4() {//regular method body open
		System.out.println("running from m4");
	}// regular method body closed
	
}
