package Overriding;

public class Method_Overriding2 {// ULC
	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.cricketShows();
		
		Batsman b = new Batsman();
		b.cricketShows();
		
		Bowler p = new Bowler();
		p.cricketShows();
		
	}

}
