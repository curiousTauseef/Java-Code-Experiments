package main.concepts.loops;

public class LoopsPractice {
	
	public static void main(String[] args) {
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ " the category:apperal and the slightly "
				+ " more in demand category:makeup along with the category:furniture and"; 
		
		printCategories(str);
		
	}
	
	/*
	 * extract all categories from the string argument posted above
	 */
	
	public static void printCategories(String str) {
		
		int i = 0; 
		while(true) {
			
			int categoryIndex = str.indexOf("category:", i);
			System.out.println("This prints the character position of the word category " + categoryIndex);
				if(categoryIndex == -1) break; 
					int start = categoryIndex + 9;
					System.out.println("This prints the position of first character in the category found " + start);
					int end = str.indexOf(" ", start); 
					System.out.println("This prints the position of the last character in the category found " + end);
					System.out.println(str.substring(start, end));
					i = end + 1; 
			
		}
	}
}
