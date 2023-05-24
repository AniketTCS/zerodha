package Inheritance;

public class Single_level_Inheritance {//ULC
	public static void main(String[] args) {
		Son s=new Son();     //creating object
		s.home();
		s. car();          // non static from different class
		s. money();
		s.secBike();
		System.out.println("beautiful wife");// call object class method
		
	}

}
