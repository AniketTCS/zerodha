package logical_programs;

import java.util.Scanner;

public class Accept_user_input_and_addition_5 {
public static void main(String[] args) {
	Scanner B =new Scanner(System.in);
	
	System.out.println("enter 1st no");
	int num1=B.nextInt();
	
	System.out.println("enter 2nd no");
	int num2=B.nextInt();
	
	System.out.println("addition"+(num1+num2));
}
}
