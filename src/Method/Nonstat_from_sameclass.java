package Method;

public class Nonstat_from_sameclass {
	public static void main(String[] args) {
		
		Nonstat_from_sameclass n =new Nonstat_from_sameclass();// object body created
		n.m4();        //n is ref.variable
		n.m3();
		n.m2();
		n.m1();
		
		
	}

	public void m1() {
		System.out.println("running from m1 from same class");
	}
	public void m2() {
		System.out.println("running from m2 from same class");
	}
	public void m3() {
		System.out.println("running from m3 from same class");
	}
	public void m4() {
		System.out.println("running from m4 from same class");
	}
}

