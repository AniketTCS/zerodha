package string_methods;

public class A {
	public static void main(String[] args) {
		String s1 = "velocity";
		String s2 = "VELOCITY";
		String s3 = "city";
		// length() >> it will give count of characters ( start with 1)
		System.out.println(s1.length());
		System.out.println(s2.length());
		// toUppercase()>>> it will convert lowercase string to uppercase
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		//equals()>> it compare two string
		System.out.println(s1.equals(s2));  // false (small & capital)
		//equalsignoreCase>> it will compare two strings ignoring their cases
		System.out.println(s2.equalsIgnoreCase(s1));  // true (words are same)
		//contains() it will check for characters inside to strings
		System.out.println(s1.contains(s3));  // true
		//charAt()>>> it will give character of string at particular position(SIOOBE)
		System.out.println(s1.charAt(5));  // start with 0 ,1,2
		// indexOf()>>it will give index of particular character
		System.out.println(s2.indexOf("Y"));
		//lastindexOf()>> it will give last index of string  (start with 0)
		System.out.println(s1.lastIndexOf("t"));
		// startWith()>> it will check our string is start with particular character(start with 0)
		System.out.println(s1.startsWith("vy"));
		// endsWith()>>it will check our string is ends with particular character
		System.out.println(s1.endsWith("ty"));
		//substring()>> it will break the string display
		System.out.println(s1.substring(4));  // count start with 0
		//concat()>>it will join two strings
		System.out.println(s1.concat(s2));
		//replace()>>it will replace the collection of characters
		System.out.println(s1.replace("city","rural"));
			
			
	}

}
