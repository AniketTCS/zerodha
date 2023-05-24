package logical_programs;

public class String_reverse_5 {
public static void main(String[] args) {
	String b ="Kalpana";
	String rev=" ";
	for (int i=b.length()-1;i>=0;i--) {
		rev=rev+b.charAt(i);
	}
	System.out.println(rev);
}
}
