package logical_programs;

public class Factorial_2 {
	public static void main(String[] args) {
		int num=10;
		int fact=1;
		for(int i=1;i<=10;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
