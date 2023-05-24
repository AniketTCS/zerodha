package Arrays;

public class A {
	public static void main(String[] args) {
		int[] i = new int [5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		// print index 1 data
		//System.out.println(i[1]);
		// we have to fetch data which is not there then we will get AIOOBE
		//System.out.println(i[6]);
		// print entire data
		for(int j=0;j<=4;j++) {
			System.out.println(i[j]);
		}
	}

}
