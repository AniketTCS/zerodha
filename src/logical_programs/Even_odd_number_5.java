package logical_programs;

import java.util.Scanner;

public class Even_odd_number_5 {
public static void main(String[] args) {
	Scanner A= new Scanner(System.in);
	
	
	 System.out.println("enter no");
	 int num= A.nextInt();
	  if(num%2==0) {
		  System.out.println("no is even");
	  }
	  else {
		  System.out.println("no is odd");
	  }
}
}
