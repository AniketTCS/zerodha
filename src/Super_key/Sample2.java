package Super_key;

public class Sample2 extends Sample1 {
	int a = 60;// global variable of subclass
public void test() {
int a=20;//local variable of test method
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
	
}
}
