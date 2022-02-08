package java_basics;

import anewpackage.SomethingToDo;

public class LearningMethods {

	public static void main(String[] args) {
		MyUtils myar;
		myar = new MyUtils(); // instance of MyUtils to invoke non-static methods
		System.out.println("Some Text");
		String text = MyUtils.printSomeJunk("Printing this text");
		System.out.println(text);
		System.out.println(myar.add10(MyUtils.sumToNumbers(3, 22)));
		
		myar.add10(100);
		SomethingToDo.doSomething();
	}

	
}
