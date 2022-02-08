package fileProcessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("/Users/vpre3001/eclipse-workspace/ProcessingFIles/src/myFile.txt");
		Scanner input = new Scanner(file);
//		System.out.println("Enter some text");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
		
	}

}
