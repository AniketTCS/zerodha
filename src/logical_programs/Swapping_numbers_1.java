package logical_programs;

public class Swapping_numbers_1 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("before swapping a:"+a);
	System.out.println("before swapping b:"+b);
	int c=a;
	a=b; // reintialization
	b=c;
	System.out.println("after swapping a: "+a);
	System.out.println("after swapping b:"+b);
}
}
