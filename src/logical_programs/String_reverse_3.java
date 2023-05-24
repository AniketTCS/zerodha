package logical_programs;

public class String_reverse_3 {
public static void main(String[] args) {
	String o="Anuja";
	String rev=" ";
	for(int i=o.length()-1;i>=0;i--) {
		rev=rev+o.charAt(i);
	}
	System.out.println(rev);
}
}
