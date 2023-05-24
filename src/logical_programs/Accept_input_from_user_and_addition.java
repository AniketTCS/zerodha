package logical_programs;

import java.util.Scanner;

public class Accept_input_from_user_and_addition {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);//it will input from user through console
	// take 1st number
	System.out.println("enter 1st no");
	int num1=scan.nextInt();//it will take actual integer data from user through console
	//take 2nd no
	System.out.println("enter 2 nd no");
	int num2=scan.nextInt();
	//add two no.
	System.out.println("addition"+(num1+num2));
}
}
