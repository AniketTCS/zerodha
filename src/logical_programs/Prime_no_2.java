package logical_programs;

public class Prime_no_2 {
public static void main(String[] args) {
	int num=5;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
		}
		if(count==2) {
			System.out.println("givn no prime");
		}
		
		else {
			System.out.println("given no is not prime");
		}
	}
}

