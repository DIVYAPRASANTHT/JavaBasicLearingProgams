package basicPrograms;

import java.util.Scanner;

public class ExtractDigitsOfNumber {

	public static void main(String[] args) {
		int m,n,a,i =0,count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your  number");
		m = scan.nextInt();
		n = m;
		
		while(m>0)
		{
			m = m/10;
			count ++;
		}
	
		while(n>0)
		{
			a = n % 10;
			System.out.println("Position number "+ count + " : " + a);
			n = n /10;
			count --;
		}
	}

}
