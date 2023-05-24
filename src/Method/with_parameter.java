package Method;

public class with_parameter {
	public static void main(String[] args) {
		addition(50,20); //CTB  compile time binding
	}
public static void addition (int a,int b) {
	int c=a+b;
	System.out.println(c);
}
}
