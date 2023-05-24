package logical_programs;

public class String_reverse_2 {
public static void main(String[] args) {
	String org="Sweta";
	String rev =" ";
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
}
}
