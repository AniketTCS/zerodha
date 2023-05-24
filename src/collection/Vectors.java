package collection;

import java.util.Enumeration;
import java.util.Objects;
import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
    Vector v = new  Vector(); // vec.ctrl space
    v.add("Aniket");
    v.add('A');
    v.add(100);
    v.add(null);
    v.add(null);
    v.add("Aniket");
    v.add(100);
    v.add("Suraj");
   // System.out.println(v);
   // System.out.println(v.size());// to check size
   // System.out.println(v.capacity());// to check capacity
  //  System.out.println(v.isEmpty()); // to check whether is empty
  //  System.out.println(v.contains(200));//false
	//System.out.println(v.get(0));//it will fetch index value
	// insertion of elements(right shift of operation)
	//v.add(0,"Sweta");
	//System.out.println(v);
	// remove of data (left shift operation)
	//v.remove(0);
	//System.out.println(v);
	// modify .replace,update the data
	//v.set(1, 'B');
	//System.out.println(v);
    
    
  //  fetch data using enumeration
//   Enumeration ele =v.elements();
//		   while(ele.hasMoreElements()) {
//	       System.out.println(ele.nextElement());
//		 }  
   
   // fetch data using for each loop
    for (Object s1:v) {
    	System.out.println(s1);
    }
	}

	}
