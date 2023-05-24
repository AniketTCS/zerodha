package Exception_Handling;

public class Arithmetic_Exception {
 public static void main(String[] args) {
	int i =1;
	int b =0;
	try {
		int c=i/b;// risky code
	}
	catch(ArithmeticException ref) {
		System.out.println("idiot ...enter valid denometer");
	}
	System.out.println("boss exception is handled");
}
}
