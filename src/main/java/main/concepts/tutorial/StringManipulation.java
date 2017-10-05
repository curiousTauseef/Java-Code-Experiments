package main.concepts.tutorial;

public class StringManipulation {
	
	/**
    Given a string of odd length, return the middle 3 characters from the string, 
    so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
    If the string length is less than 3, return the string as is. <br> <br>
 
    <b>EXPECTATIONS:</b><br>
    middleThree("bunny") <b>---></b> "unn" <br>
    middleThree("peter") <b>---></b> "ete" <br>
    middleThree("Jamaica") <b>---></b>"mai" <br>
    
    another case is the word "PA" has has less than 3 characters
     */

	public static void main(String[] args) {
		String example1 = "bunny";
		String example2 = "peter";
		String example3 = "Jamaica";
		//The below string should be returned exactly as it is
		String example4 = "PA";
		
		String myResult1 = middleThree(example1);
		System.out.println("Print the result of example1 " + myResult1);
		
		String myResult2 = middleThree(example2);
		System.out.println("Print the result of example2 " + myResult2);
		
		String myResult3 = middleThree(example3);
		System.out.println("Print the result of example3 " + myResult3);
		
		String myResult4 = middleThree(example4);
		System.out.println("Print the result of example4 " + myResult4);
		
	}
	
	public static String middleThree(String str) {
		String result = str;
		if (str.length() >= 3) {
			//In integer division the divider is dropped 
			int middleValue = str.length()/2;  
			result = str.substring(middleValue-1, middleValue+2);
		}
		return result;
	}
}
