package objectorientedprogramming;

public class Fish extends Animal {
	
	public Fish(String species, String name, String color, int id, String favoriteFood) {
		super(species, name, color, id, favoriteFood);
	}

	public void fly() {
		System.out.println("flying");
	}

	public void move() {
		System.out.println("fish is swimming");		
	}
}
