package Hirarchicle;

public class Hirarchy_Inheritance {//ULC
	public static void main(String[] args) {
		Son1 s1=new Son1(); //object 1
		s1.home();
		s1.car();
		s1.money();
		s1.secBike();
		System.out.println("properties of son1");//1@156643d4
		System.out.println(s1);
		
		
		Son2 s2=new Son2(); //object 2
		s2.home();
		s2.car();
		s2.money();
		s2.secLappy();
		System.out.println("properties of son2");
		System.out.println(s2);
		
		Son3 s3=new Son3(); //object 3
		s3.home();
		s3.car();
		s3.money();
		s3.secMob();
		System.out.println("properties of son3");
		System.out.println(s3);
		
		
	}

}
