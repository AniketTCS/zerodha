package logical_programs;

public class String_palindrome3 {
public static void main(String[] args) {
	String B="mom";
	String rev="";
	for(int i=B.length()-1;i>=0;i--) {
		rev=rev+B.charAt(i);
	}
	System.out.println(rev);
	if(B.equals(rev)) {
		System.out.println("Given system is palindrome");
	}
	else {
		System.out.println("Given system is not palindrome");
	}
}
}
