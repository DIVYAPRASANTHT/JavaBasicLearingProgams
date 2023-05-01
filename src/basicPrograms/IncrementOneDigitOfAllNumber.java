package basicPrograms;

import java.util.Scanner;

public class IncrementOneDigitOfAllNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your  number");
		int number = scan.nextInt();
		int unitDigit,sum = 0;
		
		while(number>0)
		{
			unitDigit = number % 10;
			sum = sum*10 + (unitDigit+1);
			number = number/10;
		}
		System.out.println(sum);
	}

}
