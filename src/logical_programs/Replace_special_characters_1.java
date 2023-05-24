package logical_programs;

import java.util.Scanner;

public class Replace_special_characters_1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the name with special character");
	String name = scan.next();
	String actname=name.replaceAll("[^a-zA-Z]", "");
	System.out.println(actname);
}
}
