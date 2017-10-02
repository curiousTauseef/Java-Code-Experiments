package java.main.concepts;
import java.util.*;

public class GreatestCommonDivisorProgram 
{

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int div;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number ");
		num1 = input.nextInt();
		System.out.print("Enter the second number ");
		num2 = input.nextInt();
		
		if(num1 > num2)
		{
			div = num2;
		}
		else
		{
			div = num1;
		}
		while((num1 % div != 0) || (num2 % div != 0))
		{
			div --;
		}
		System.out.println("The GCD for " + num1 + " and " + num2 + " is " + div );
	}
}
