package Star_patterns;

public class B {
public static void main(String[] args) {
	for(int i=1;i<=3;i++) { //outer loop for rows
		for(int j=1;j<=3;j++) { //inner loop for column
			if(i==1&&j==1) {
				System.out.print("@");
			}
			else {
				System.out.print("*");
			}//end else
		}// end inner for
		System.out.println();
	}
}
}
