package javaConcepts;

public class ConversionPrograms {

	public static void main(String[] args) {
		
		//Boolean toString() method in Java
		
		boolean a = true;
		System.out.println(booleanToStringConversion(a));
		
		//Convert String to Double in Java
		
		String b = "02022";
		stringToDoubleConversion(b);
		
		//Java Program to Convert Double to String
		
		Double c = 02022.0;
		doubleToString(c);
		
		//Java Program to Convert Long to String
		
		Long d = 999L;
		longToStringConversion(d);
		
		// Java Program to Convert Integer to Character
		int f = 64;
		intToCharConversion(f);
		
		//Java Program to Convert Char to Int
		char ch = '3';
		charToIntConversion(ch);
	}
	
	public static String booleanToStringConversion(boolean a)
	{
		String output = Boolean.toString(a);
		return output;
	}
	
	public static void stringToDoubleConversion(String b)
	{
		Double output1 = Double.parseDouble(b);
		Double output2 = Double.valueOf(b);
		System.out.println(output1);
		System.out.println(output2);
	}
	public static void doubleToString(Double c)
	{
		String output1 = String.valueOf(c);
		String output2 = c.toString();
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output1+output2);
	}
	
	public static void longToStringConversion(Long a)
	{
		String output1 = ""+a;
		System.out.println("Converted type : "+output1.getClass().getName());
		String output2 = String.valueOf(a);
		String output3 = a.toString();
		String output4 = String.format("%d",a);
		String output5 = new StringBuilder().append(a).toString();
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(output4);
		System.out.println(output5);
	}
	public static void intToCharConversion(int a)
	{
		char output1 = (char)(a+'0');
		System.out.println(output1);
		int i = a+'0';
		System.out.println(i);
	}
	public static void charToIntConversion(char a)
	{
		char ch = a;
		int output1 = ch-'0';
		int output2 = Character.valueOf(a);
		int output3 = Character.valueOf('0');
		int b = Integer.parseInt(String.valueOf(ch));
		int c = Character.getNumericValue(ch);
		System.out.println(output1);
		System.out.println(b);
		System.out.println(c);
		System.out.println(output2);
		System.out.println(output3);
	}
}
