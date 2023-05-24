package logical_programs;

public class String_palindrome_2 {
public static void main(String[] args) {
	String A="Aniket";
	String rev =" ";
	for(int i=A.length()-1;i>=0;i--) {
		rev=rev+A.charAt(i);
	}
	System.out.println(rev);
	if(A .equals(rev)) {
		System.out.println("given system is palindrome");
	}
	else {
		System.out.println("given system is not palindrome");
	}
}
}
