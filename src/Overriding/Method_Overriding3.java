package Overriding;

public class Method_Overriding3 {//ULC
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.mobilePrice();
		
		I_Phone i = new I_Phone();
		i.mobilePrice();
		
		Samsung s = new Samsung();
		s.mobilePrice();
	}

}
