package logical_programs;

public class white_spaces_counting_1 {
public static void main(String[] args) {
	String name= "v e l o c i t y";
	int count=0;
	for(int i=0;i<=name.length()-1;i++) {
	char ch = name.charAt(i);
	if(ch==' ') {
		count++;
	}
	}
	System.out.println(count);
}
}
