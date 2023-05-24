package logical_programs;

import java.util.Scanner;

public class Replace_special_characters_3 {
public static void main(String[] args) {
	Scanner B =new Scanner(System.in);
	System.out.println("enter special character");
	String name= B.next();
	String actname= name.replaceAll("[^a-zA-Z]", "");
	System.out.println(actname);
}
}
