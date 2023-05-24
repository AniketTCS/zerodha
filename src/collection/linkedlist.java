package collection;

import java.util.Iterator;
import java.util.LinkedList;

import com.google.common.base.Objects;

public class linkedlist {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add("Anuja");
	ll.add('R');
	ll.add("Sweta");
	ll.add(200);
	ll.add("Anuja");
	ll.add(null);
	ll.add(null);
	//System.out.println(ll.size());
	//System.out.println(ll.get(5));
	//System.out.println(ll.get(6));
	//System.out.println(ll.isEmpty());// false
	//System.out.println(ll.contains(300));// 0false
	//insertion in ll (right shift operation)
	//ll.add(1,'J');
	//System.out.println(ll);
	// remove data from collection
	//ll.remove(1);
	//System.out.println(ll);
	// modification , updation, replace
	//ll.set(2, "OM");
	//System.out.println(ll);
	
	//fetch data using iterator
	//Iterator itr =ll.iterator();
	  //while(itr.hasNext()) {
		// System.out.println(itr.next());
	 // }
	
	//fetch data using for each loop
   for(Object si:ll ) {
		System.out.println(si);
	}
}
}
