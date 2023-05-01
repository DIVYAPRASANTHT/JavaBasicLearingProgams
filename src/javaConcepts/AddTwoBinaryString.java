package javaConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoBinaryString {

	static String add_Binary(String x, String y) 
    { 
	  String res = "";
	  int sum = 0;
	  int a = x.length()-1;
	  int b = y.length()-1;
	  
	  while(a >=0 || b >= 0 || sum==1)
	  {

		  sum +=  ((a >= 0) ? x.charAt(a) - '0' : 0 );
		  sum +=  ((b >= 0) ? y.charAt(b) - '0' : 0 );
		  
		  res = (sum % 2) + res;
		  sum /= 2;
		  a--;
		  b--;
	  }
	  return res;
	  
    } 
  
    // The Driver code 
    public static void main(String args[]) 
    { 
        String x = "1", y = "1"; 
  
        System.out.print(add_Binary(x, y)); 
    } 
}
