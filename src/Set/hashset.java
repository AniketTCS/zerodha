package Set;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Sweti");
		hs.add(100);
		hs.add('A');
		hs.add(null);
		hs.add(100);
		hs.add(null);
		//print entire data
		//System.out.println(hs);//random  insertion
		//System.out.println(hs.size());//not consider duplicate
		//System.out.println(hs.isEmpty());//false
		//System.out.println(hs.contains(100) );//true
		
	}

}
