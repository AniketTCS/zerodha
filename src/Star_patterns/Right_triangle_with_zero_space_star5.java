package Star_patterns;

public class Right_triangle_with_zero_space_star5 {
	public static void main(String[] args) {
		int space=0;
		int star=5;

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space ;j++) {
				System.out.print(" ");
		}
			for(int j=1;j<=star ;j++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
	}
	}
}
