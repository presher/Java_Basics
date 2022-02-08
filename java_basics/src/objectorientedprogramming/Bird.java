package objectorientedprogramming;

public class Bird extends Animal{

	public Bird(String species, String name, String color, int id, String favoriteFood) {
		super(species, name, color, id, favoriteFood);
	}

	@Override
	public void move() {
		System.out.println("flapping wings...");
		
	}

}
