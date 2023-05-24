package Exception;

public class Array_index_out {
public static void main(String[] args) {
	String ar[]= new String[5];
	ar[0]="Pratap";
	ar[1]="Akash";
	ar[2]="Vijay";
	ar[3]="Rocky";
	ar[4]="Ankush";
	System.out.println(ar[4]);
	System.out.println(ar[5]);// if u try to fetch index which is not there then we will get AIOOBE
}
}
