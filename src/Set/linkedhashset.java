package Set;

import java.util.LinkedHashSet;


public class linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Sweta");
		lhs.add('A');
		lhs.add(100);
		lhs.add(null);
		lhs.add(100);
		lhs.add(null);
		//System.out.println(lhs);
		//System.out.println(lhs.size());//4
		//System.out.println(lhs.isEmpty());//false
		//System.out.println(lhs.contains("Sweta"));//true
	}

}
