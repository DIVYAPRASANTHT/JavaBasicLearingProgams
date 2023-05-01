package javaConcepts;

public class TrianglePattern {

	public static void main(String[] args) {

		int n = 5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
//Above programs output		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
//Above programs output	
//		    * 
//	      * * 
//	    * * * 
//	  * * * * 
//	* * * * *
		System.out.println("-----------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//		    * 
//	      * * * 
//	    * * * * * 
//	  * * * * * * * 
//	* * * * * * * * * 
		
		System.out.println("-----------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*n-2*i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//		* * * * * * * * * 
//		  * * * * * * * 
//		    * * * * * 
//		      * * * 
//		        *
		System.out.println("-----------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+i-1+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+i-1+" ");
				
			}
			System.out.println();
		}
//        1 
//      2 3 2 
//    3 4 5 4 3 
//  4 5 6 7 6 5 4 
//5 6 7 8 9 8 7 6 5 
	}

}
