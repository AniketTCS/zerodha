package logical_programs;

import java.util.Arrays;

public class order_data_in_array_1 {
public static void main(String[] args) {
	int ar[]= {90,45,60,20,30,10};
	// print entire data
	//for(int i=0;i<=ar.length-1;i++) {
	//	System.out.println(ar[i]);// print data acending order
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++) {
	System.out.println(ar[i]);
	}
}

}