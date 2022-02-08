package objectorientedprogramming;

public abstract class Animal {//cannot create an instance of abstract classes
	
	String species;
	String name;
	String color;
	int id;
	String favoriteFood;
	
	public Animal(String species, String name, String color, int id, String favoriteFood) {
		super();
		this.species = species;
		this.name = name;
		this.color = color;
		this.id = id;
		this.favoriteFood = favoriteFood;
		
	}

	public void eat() {
		System.out.println("I like to eat " + favoriteFood);
	}
	
	public void speak() {
		System.out.println("My species is " + species + "," + " I am " + color + " in color," 
	+ " my id is " + id);
	}
	
	public void sleep() {
		System.out.println("sleeping....");
	}
	
	public abstract void move();
}
