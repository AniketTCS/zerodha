package logical_programs;

public class Product_of_no_from_4_to_8 {
public static void main(String[] args) {
	int num=8;
	int product=1;
	for(int i=4;i<=num;i++) {
		product=product*i;
	}
	System.out.println(product);
}
}
