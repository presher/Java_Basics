package objectorientedprogramming;

public class Human {
	
	String name;
	int age;
	int heightInches;
	String eyeColor;
	
	
	
	
	
	public Human(String name, int age, int heightInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInches = heightInches;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hello my name is " + name);
		System.out.println("I am  " + heightInches + " inches tall");
		System.out.println("I am " + age + " years old");
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking....");
	}
	
	public void work() {
		System.out.println("working...");
	}



	public void age(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
