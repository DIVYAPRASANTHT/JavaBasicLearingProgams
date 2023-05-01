package basicPrograms;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your  number");
		int number = scan.nextInt();
		int number1 = number;
		int unitDigit,sum = 0;
		SumOfDigitsOfNumber obj = new SumOfDigitsOfNumber();
		
		while(number>0)
		{
			unitDigit = number % 10;
			sum = sum + unitDigit;
			number = number/10;
		}
		
		System.out.println("Count of digits "+ sum);
		
		int result = obj.add(number1);
		System.out.println(result);
		System.out.println(1/10);
	}
	
	int add(int n)
    {
        int sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum + add(n / 10);
        }
 
    }

}
