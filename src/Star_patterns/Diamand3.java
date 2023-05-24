package Star_patterns;

public class Diamand3 {
	public static void main(String[] args) {
		int space =2;
		int star =1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space ;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=2) {
				star=star+2;
				space--;
			}
			else {
				star=star-2;
				space++;
			}
		}
	}
}
