package logical_programs;

public class Product_of_no_3_to_9 {
public static void main(String[] args) {
	int num=9;
	int product=1;
	for(int i=3;i<=num;i++) {
		product=product*i;
	}
	System.out.println(product);
}
}
