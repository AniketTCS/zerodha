package parameterised_constructor;

public class Guns {// BLC
	String gunName;
	int noOfBullets;
	public Guns(String gunName,int noOfBullets) {
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
		}
	public void shoot () {             //METHOD NAME
		for(int i=1;i<=noOfBullets;i++) {   // FOR LOOP
			System.out.println("deshkew");
		}
	}

}
