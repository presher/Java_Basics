package objectorientedprogramming;

public class Earth {
	public static void main(String args[]) {
		
		Human human1 = new Human("Tom", 21, 60, "hazel");
		Human human2 = new Human("Bill", 44, 48, "brown");
		Human human3 = new Human("Sarah", 18, 65, "blonde");
		
		human1.speak();
		human2.speak();
		human3.speak();
	}
}
