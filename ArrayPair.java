package arrays_experiments;

public class ArrayPair 
{
	public static void main(String[] args) 
	{

		int[] numbers;
		numbers = new int[5];
		numbers[0] = 15;
		numbers[1] = 13;
		numbers[2] = 15;
		numbers[3] = 17;
		numbers[3] = 19;

		int i = 0;

		if (numbers[i] == 13 && numbers[i + 1] == 13) 
		{
			System.out.println("The element of the array " + numbers[i]);
		} 
		else 
		{
			System.out.println("Number 13 in the array is not adjacent to itself");
		}
	}
}
