package logical_programs;

public class String_palindrome5 {
	public static void main(String[] args) {
		String A ="dad";
		String rev="";
		for(int i=A.length()-1;i>=0;i--) {
			rev=rev+A.charAt(i);
		}
		System.out.println(rev);
		if(A.equals(rev)) {
		System.out.println("Given systeam is palindrome");
		}
		else {
			System.out.println("Given system is not palindrome");
		}
	}
}
