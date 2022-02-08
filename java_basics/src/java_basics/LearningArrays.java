package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		int [] values = new int[100];
		values[0] = 1000;
		values[99] = 93432;
		for(int i = 0; i < values.length; i++) {
			values[i] = i * 9;
		}
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

}
