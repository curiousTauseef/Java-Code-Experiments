package data.structures.examples;

/*
 * In the below example, the dog can only bark between 
 * 7 and 20 for the owner not to be in trouble.
 */

public class StringsPractice {
	
	public static void main (String[] args) {
		
		System.out.println(dogTrouble(true, 6));
		System.out.println(dogTrouble(true, 7));
		System.out.println(dogTrouble(true, 21));
		System.out.println(dogTrouble(false, 6));
		
	}
	
	public static boolean dogTrouble(boolean barking, int hour) {
		if(barking && (hour < 7 || hour > 20 )) {
				return true;
				
		} else {
			return false; //not in trouble
		}	
	}
}
