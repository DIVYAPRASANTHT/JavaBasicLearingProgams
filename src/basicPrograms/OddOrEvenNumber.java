package basicPrograms;

import java.util.Scanner;

public class OddOrEvenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int first = scan.nextInt();
//		System.out.println("Enter your Second number");
//		int second = scan.nextInt();
		
		if(first%2==0) {System.out.println(first+ " is even number");}
		
		else {System.out.println(first+ " is odd number");}
		
	}

}
