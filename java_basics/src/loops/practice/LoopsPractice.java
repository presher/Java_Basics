package loops.practice;

public class LoopsPractice {

	public static void main(String[] args) {
//		int count = 0;
//		while(count <= 100) {
//			System.out.println("jason" + count);
//			count++;
//			
//			if( count == 30) {
//				break;
//			}
//		}
		
		String str = "We have a large inventory of things in our warehouse "
				+ "falling in the category:apperal and the slightly more in deamnd "
				+ "category:makeup along with the category:funiture and ...";
		
//		printCategories(str);
		
		String name = "dfqftsdfsfsdfsfsfsf";
//		for(int i = name.length() - 1; i >= 0; i--) {// reverse for loop
//			System.out.print(name.charAt(i));
//		}
		
//		for(int i = 0; i <= 100; i-=5) {
//			System.out.print("\n");
//			System.out.print(i);
//		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 10; j+=2) {
				
				System.out.print("\nThe value of i was " + i + " ------ " + j);
			}
		}
	}
	
	public static void printCategories(String str) {
		int i = 0;
		while(true) {
			int found = str.indexOf("category:", i);
			if (found == -1) break;
			int start = found + 9; //start of actual category
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end + 1;
		}
	}
	
}
