package main.concepts;

public class SumMinus {
	
	/**
     * Add both parameters (a & b) together and 
     * subtract the number 3 and return the result<br>
     * 	<br> 
     *	<b>EXPECTATIONS:</b><br>
     *	sumMinus3(2, 5) <b>---></b> 4 <br>
     *	sumMinus3(2, 1)  <b>---></b> 0 <br>
     *	sumMinus3(0, 2) <b>---></b> -1 <br>
     */
        public static int sumMinus3(int a, int b) {
        		if( (a < 0) || (b < 0)) {
        			return 0; 
        		}
             
            return (a + b) -3;
        }
         
	public static void main(String[] args) {
		System.out.println("Example 1 " + sumMinus3(2,5)); 
		System.out.println("Example 2 " + sumMinus3(2,1)); 
		System.out.println("Example 3 " + sumMinus3(0,2)); 

	}

}
