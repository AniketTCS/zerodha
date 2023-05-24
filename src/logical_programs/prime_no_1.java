package logical_programs;

public class prime_no_1 {
public static void main(String[] args) {
	int num=8; // given no
	int count=0;//count intially 0
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if (count==2) {
		System.out.println("given no is prime");
	}
	else {
		System.out.println("given no is not prime");
	}
}
}
