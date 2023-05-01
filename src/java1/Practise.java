package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) throws IOException{
//			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//			String name = bf.readLine();
//			System.out.println(name);
//			
			 Scanner in = new Scanner(System.in);
			 
		        String s = in.nextLine();
		        System.out.println("You entered string " + s);
		 
		        Integer a = in.nextInt();
		        System.out.println("You entered integer " + a);
		 
		        float b = in.nextFloat();
		        System.out.println("You entered float " + b);
//		        
		        // Using Console to input data from user
//		        String name = System.console().readLine();
//		 
//		        System.out.println("You entered string " + name);
	}

}
