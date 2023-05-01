package javaConcepts;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		
		int x = 5;
		int n = 0;
		for(int i=1;i<=x;i++)
		{
//			n = i-1;
			for(int j=1;j<=x-i;j++)
			{
				System.out.print("  ");
			}
			
			// Below are my logic
//			for(int k=1;k<=(2*i)-1;k++)
//			{
//				if(k==1||k==(2*i)-1)
//				{
//					System.out.print(i+" ");	
//				}
//				else {
//				System.out.print((i+k-1)<=2*i-1
//						?(i+k-1)+" "
//					    :(i)+" "
//					    );
//				}
			//===========================
			// Pyramid printing
//            for (int j = 0; j <= n; j++)
//                System.out.print((i + j) < 9
//                                     ? (i + j) + " "
//                                     : (i + j) + " ");
 
//            for (int j = 1; j <= n; j++)
//                System.out.print((i + n - j) < 10
//                                     ? (i + n - j) + " "
//                                     : (i + n - j) + " ");
// 
			
			System.out.println();
		}

	}

}
