package javaConcepts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadInput {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String data = bf.readLine();
		
		System.out.println("Your input was : " + data);
	}

}
