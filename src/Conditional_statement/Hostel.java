package Conditional_statement;

public class Hostel {
	public static void main(String[] args) {
		switch("idle") {// output of expression
		
		case "idle":{// true
			System.out.println("on monday");
			break;
			//System.out.println("i want vad also");//unreachable statement
			
		}
		case "dosa":{//false
			System.out.println("on thrusday");
			break;
		}
		case "utappa":{
			System.out.println("on saturday");
			break;
		}
		default:{
			System.out.println("no chatney");
		}
		}
	}

}
