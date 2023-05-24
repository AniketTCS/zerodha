package logical_programs;

import java.util.Scanner;

public class Replace_special_characters_2 {
public static void main(String[] args) {
	Scanner A =new Scanner(System.in);
	System.out.println("enter name with special caracter");
	String name=A.next();
	String actname= name.replaceAll("[^a-zA-Z]", "");
	System.out.println(actname);
}
}
