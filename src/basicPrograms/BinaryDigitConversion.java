package basicPrograms;

import java.util.Scanner;

public class BinaryDigitConversion {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your  number");
		int number = scan.nextInt();
		int rem = 0;
		int binary = 0;
		
		while(number>0)
		{
			rem = number % 2;
			binary = binary*10 + rem;
			number = number/2;
		}
		System.out.print(binary);
	}

}
