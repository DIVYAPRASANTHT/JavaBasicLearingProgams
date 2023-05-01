package javaConcepts;

public class LcmOfNumber {
	
	// Java program to find LCM of two numbers.
//	u x v = LCM(u, v) * GCD (u, v)
//	LCM(u, v) = (u x v) / GCD(u, v)
	    // Gcd of u and v using recursive method
	  
	public static int GCD(int a, int b)
	{
		
		int diff = a%b;
		while(diff!=0)
		{
			a = b;      // 7 ; 4 ; 3 ; 1 ; 2
			b = diff;   // 4 ; 3 ; 1 ; 2 ; 1
			diff = a%b; // 3 ; 1 ; 2 ; 1 ; 0
		}
		System.out.println("GCD is "+ b);
		return b;
	}
	
	public static int LCM (int a, int b)
	{
		return (a*b/GCD(a,b));
	}
	public static void main (String[]args){
		
		int l = 2;
		int m = 3;
		System.out.println("LCM of "+l+" and "+m+" is : "+LCM(l,m));
	}
	

}
