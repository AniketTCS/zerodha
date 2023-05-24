package parameterised_constructor;

public class Pubg { //ULC
	public static void main(String[] args) {
		Guns g = new Guns("Ak47",10) ; //object creation
		g.shoot();              // method calling another class
		System.out.println("1st shoot is done");
	
	
	Guns g1 = new Guns (" pistol",6);
   g1.shoot();
   System.out.println( "2nd shoot done");
   
   Guns g2 = new Guns (" sniper",7);
   g2.shoot();
   System.out.println( "3rd shoot done");
   
   Guns g3 = new Guns (" carbine",15);
   g3.shoot();
   System.out.println( "4th shoot done");
   
   Guns g5 = new Guns (" revolver",6);
   g5.shoot();
   System.out.println( "5nd shoot done");
   
	}

}
