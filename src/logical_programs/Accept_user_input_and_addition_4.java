package logical_programs;

import java.util.Scanner;

public class Accept_user_input_and_addition_4 {
public static void main(String[] args) {
	Scanner A=new Scanner(System.in); // acces to user
	
System.out.println("enter 1st no");	
int num1= A.nextInt();

System.out.println("enter 2nd no");
int num2=A.nextInt();

System.out.println("addition"+(num1+num2));
}
}
