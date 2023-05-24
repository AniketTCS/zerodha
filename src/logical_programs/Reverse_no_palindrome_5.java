package logical_programs;

public class Reverse_no_palindrome_5 {
	public static void main(String[] args) {
		int num=78787;
		int revnum=0;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			revnum=revnum*10+rem;
		}
		System.out.println(revnum);
		if(num==revnum) {
			System.out.println("no is palindrome");
		}
		else {
			System.out.println("no is not palindrome");
		}
	}
}
