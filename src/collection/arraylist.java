package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.google.common.base.Objects;

public class arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Ganesh"); // count start with 0
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(100);
		al.add(null);
	//	System.out.println(al);// it will print entire data in existing sequence
	//	System.out.println(al.size());//it will give size
	//	System.out.println(al.contains(100));// check whether given value is present in arraylist or not
	//System.out.println(al.isEmpty());//it will shows whether our AL is empty
	// insert new value in arraylist (right shift operation)
	//al.add(2,200);
	//System.out.println(al.get(2));
	//System.out.println(al);
	// remove element from AL
	//al.remove(3);
	//System.out.println(al);
	//}
	//}
		
		
  // how to fetch data  using iterator  cursor
	
//  Iterator itr =al.iterator();
//  while(itr.hasNext()) {
//	 System.out.println(itr.next());
//  }
  // fetch data using ListIterator
//ListIterator	litr= al.listIterator();
//	while(litr.hasNext()) {
//		System.out.println(litr.next());
//	}
		
		//fetch data using for each loop
		for(Object s1:al) {
			System.out.println(s1);
		}

	}
}
