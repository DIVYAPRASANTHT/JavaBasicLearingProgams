package javaConcepts;

public class BinaryToOctalConversion {

	public static void main(String[] args) {
		BinaryToOctalConversion BOC = new BinaryToOctalConversion();
		System.out.println("Octal Number "+BOC.decimalToOctalConverter(1001001));
		
		String onum = "41";
		 
        // octal to decimal using Integer.parseInt()
        int num = Integer.parseInt(onum, 8);
 
        System.out.println(
            "Decimal equivalent of Octal value 157 is: "
            + num);
	}

	
	public int BinaryToDecimalNumber(long binary)
	{
		int i=0, decimalNumber = 0;
		while(binary>0)
		{
			decimalNumber += Math.pow(2, i)*(binary%10);
			i++;
			binary/=10;
		}
		return decimalNumber;
	}
	
	public String decimalToOctalConverter(long i) {
		int decimalNumber = BinaryToDecimalNumber(i);
		String Octal = Integer.toOctalString(decimalNumber);
		return Octal;
	}

}
