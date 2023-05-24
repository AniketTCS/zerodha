package Overriding;

public class Method_Overriding {// ULC
	public static void main(String[] args) {
		Animal a = new Animal();
		a.animalsTalk();
		
		Cat c =new Cat();
		c.animalsTalk();
		
		Dog d = new Dog();
		d.animalsTalk(); 
	}

}
