package javaConcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class BufferClass {

	public static void main(String[] args) throws IOException {

		FileReader Fr;
		try {
			File fl = new File("file.txt");   // create a file object for the current location  	
			
			fl.createNewFile();  // trying to create a file based on the object
			
			Fr = new FileReader("file.txt");
			BufferedReader bf = new BufferedReader(Fr);
			
			char ch[] = new char [10];
			
			if (bf.markSupported()) {
				
				System.out.println("Mark operation supported for the given opeation");
				bf.mark(1);
				
				bf.skip(2);
				
				if(bf.ready())
				{
					 System.out.println(bf.readLine());
					 bf.read(ch);
					 
					 for(int i =0 ; i < ch.length; i++)
					 {
						 System.out.print(ch[i]+ "");
					 }
					 System.out.println();
				}
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}

}
