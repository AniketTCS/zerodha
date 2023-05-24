package Exception;

public class NullPointerExp {
int i =10;// whenever we are trying to fetch non static members with null reference then we will get NPE
public static void main(String[] args) {
	NullPointerExp npe = null;
	System.out.println(npe.i);
}
}
