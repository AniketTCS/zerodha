package Set;

import java.util.TreeSet;

public class treeset {// 1,5,9,4,2,7
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(5);
		ts.add(9);
		ts.add(7);
		ts.add(2);
		ts.add(4);
		ts.add(9);
		//System.out.println(ts);
		//System.out.println(ts.isEmpty());// false
//		System.out.println(ts. contains(5));//true
//	System.out.println();
	ts.remove(5);
	System.out.println(ts);
//		
	}
	

}
