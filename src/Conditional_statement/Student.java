package Conditional_statement;

public class Student {
	public static void main(String[] args) {
		
		int marks =20;
		if(marks>=65) {
			System.out.println("pass with distinction");
		}
		else if (marks>=50) {
			System.out.println("pass with 1st class");
		}
		else if (marks>=40) {
			System.out.println("pass with 2nd class");
		}
		else if(marks>=35) {
			System.out.println("pass");
			
			}
		else {
			System.out.println("succefully fail");
		}
	}
	

}
