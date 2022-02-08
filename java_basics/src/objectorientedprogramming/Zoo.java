package objectorientedprogramming;

public class Zoo {

	public static void main(String[] args) {
	
		Sparrow sparrow = new Sparrow("sparrow", "Dave", "red", 11, "worms");
		sparrow.eat();
//		sparrow.fly();
		sparrow.sleep();
		sparrow.speak();
		moveAnimal(sparrow);
		
		
		Chicken chick = new Chicken("chicken", "Sarah", "white", 55, "worms");
		chick.eat();
		chick.sleep();
		chick.speak();
	}
	
	public static void moveAnimal(Animal animal) {
		System.out.println(animal);
	}

}
