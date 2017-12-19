package enumeration.example;

/*
 * Enumeration usage
 */

class EnumerationExample {
	
	public void printPosition(Position pos) {
		System.out.println("This prints the position " + pos);
			
		}
	public static void main (String args[]) {
		EnumerationExample en = new EnumerationExample(); 
		en.printPosition(Position.CATCHER);
		
	}
	
	public enum Position {
		PITCHER,
		CATCHER,
		FIRST_BASE,
		SECOND_BASE,
		SHORTTOP,
		THIRD_BASE,
		LEFT_FIELD,
		CENTER_FIELD,
		RIGHT_FIELD

	}
}
