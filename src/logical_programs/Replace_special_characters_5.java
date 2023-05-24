package logical_programs;

import java.util.Scanner;

public class Replace_special_characters_5 {
public static void main(String[] args) {
	Scanner A = new Scanner(System.in);
	System.out.println("enter special character");
	String name= A.next();
	String actname=name.replaceAll("[^a-zA-Z]", "");
	System.out.println(actname);
}
}
