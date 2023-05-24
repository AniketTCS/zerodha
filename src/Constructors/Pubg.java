package Constructors;

public class Pubg {
	public static void main(String[] args) {
		Gun g= new Gun();    // object create of gun class
		g.gunName="Ak47";
		g.noOfBullets=6;     // initialization
		g.shoot();
		System.out.println("completed 1st shoot");
		
	}

}
