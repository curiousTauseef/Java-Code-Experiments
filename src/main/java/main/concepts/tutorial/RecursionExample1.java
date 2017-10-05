package main.concepts.tutorial;

public class RecursionExample1 {
	
	public static void main (String[] args) {
		//These examples will return the dollar sign after each character
		System.out.println(allDollars("hello")); 
		System.out.println(allDollars("bunny")); 
		//This will simply return the string as it is because it only holds 1 character
		System.out.println(allDollars("a")); 
		
		//Some long string
		System.out.println(allDollars("hellodhfggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg")); 
			
	}

	private static String allDollars(String str) {
		
		if(str.length() <= 1) {
			return str; 
		}
		
		return str.charAt(0) + "$" + allDollars(str.substring(1));	
	}
}
