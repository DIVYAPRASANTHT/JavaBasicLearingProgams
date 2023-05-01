package javaConcepts;

import java.util.Arrays;

public class PrintNprimeNumbers {

	
	public static int[] primeNumbersProducer(int n)
	{
		
		int result [] = new int [n];
		int k=0;
		for(int i=1;i<=n;i++)
		{
			int flag = 0;
			if(i==0 || i==1)
			{
				continue;
			}
			
			for(int j=2 ; j< i; ++j)
			{
				if(i%j==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				result[k++] = i;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int n = 10;
		int result [] = primeNumbersProducer(n);
		for(int i=n-1; i >= 0; i--)
		{
			if(result[i]!=0)
			{
				System.out.print(result[i]+ " ");
			}
		}
		System.out.println();
	}

}
