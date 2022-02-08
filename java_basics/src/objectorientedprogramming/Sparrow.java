package objectorientedprogramming;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String species, String name, String color, int id, String favoriteFood) {
		super(species, name, color, id, favoriteFood);
	}

	public void fly() {
		System.out.println("Sparrow flying high");
		
	}

}
