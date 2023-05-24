package logical_programs;

import java.util.Scanner;

public class Even_odd_number_1 {
public static void main(String[] args) {
	Scanner A =new Scanner(System.in);
	
	System.out.println("enter the no");
	int num= A.nextInt();
	if(num%2==0) {
		System.out.println("given no is even");
	}
	else {
		System.out.println(" given no is odd");
	}
	
}
}
