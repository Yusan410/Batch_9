package day35_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckException {
	public static void main(String[] args)  {
		
		
		File file = new File("/Users/HelloJva");
		
		
			try {
				FileReader fr = new FileReader(file);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				//System.out.println("Fie not found");
			}
		
		
		
		System.out.println("i am here");
		
		
	}

}
