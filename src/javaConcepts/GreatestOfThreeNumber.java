package javaConcepts;

public class GreatestOfThreeNumber {

	public static int FindBigNumber(int x, int y, int z)
	{
		int result = 0;
	
		result = x > ( y>z ? y:z) ? x : (y>z ? y :z) ;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int number = FindBigNumber(1,1,1);
		System.out.println(number);
	}

}
