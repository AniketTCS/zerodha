package logical_programs;

public class Product_of_no_from_1_to_10 {
public static void main(String[] args) {
	int num=10;
	int product=1;
	for(int i=1;i<=num;i++) {
		product=product*i;
	}
	System.out.println(product);
}
}
