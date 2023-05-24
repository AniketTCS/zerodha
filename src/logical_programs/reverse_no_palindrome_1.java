package logical_programs;

public class reverse_no_palindrome_1 {
public static void main(String[] args) {
	int num=1216;
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
