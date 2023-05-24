package logical_programs;

import java.util.Scanner;

public class Accept_user_input_addtion_2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 1st no");
	int num1=scan.nextInt();
	System.out.println("enter 2nd no");
	int num2=scan.nextInt();
	System.out.println("addition"+(num1+num2));
}
}
