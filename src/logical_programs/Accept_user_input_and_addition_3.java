package logical_programs;

import java.util.Scanner;

public class Accept_user_input_and_addition_3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);// access to user
	
	System.out.println("enter 1st no");
	int num1=scan.nextInt();// print no.1
	
	System.out.println("enter 2nd no.");
	int num2=scan.nextInt();// print no.2
	
	System.out.println("addition"+(num1+num2));
}
}
