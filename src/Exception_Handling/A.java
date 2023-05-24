package Exception_Handling;

public class A {
public static void main(String[] args) {
	try {
		System.out.println(10/0);// risky code
	}
	catch(NullPointerException g) {
		System.out.println("idiot .. enter valid denomrator");
	}
	finally {
		System.out.println("Thank you for using ATM");
	}
}
}
