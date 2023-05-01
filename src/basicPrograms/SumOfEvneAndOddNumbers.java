package basicPrograms;


import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvneAndOddNumbers {

	public static void main(String[] args) {
		int numberOfElement = 0;
		int elements[];
		int OddSum = 0;
		int EvenSum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of element you want in array");
		numberOfElement = scan.nextInt();
		elements = new int [numberOfElement];
		
		// Number storing into the array
		for(int i = 0 ; i < numberOfElement ; i++)
		{
			elements[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(elements));
		
		// Checking Odd or Even from the stored array
		
		for(int j = 0 ; j < numberOfElement ; j++)
		{
			if(elements[j] % 2 == 0)
			{
				EvenSum = EvenSum + elements[j];
			}
			else
			{
				OddSum = OddSum + elements[j];
			}
			
		}
		
		System.out.println("Even number sum " +EvenSum);
		System.out.println("Odd number sum " +OddSum);
	}

}
