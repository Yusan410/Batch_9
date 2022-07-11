package internationalWomensDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleThexEXCEPTION {
	
	public static void main(String[] args) {
		
		File file = new File("/User/YusanAli/java");
		
		try {
			FileReader name = new FileReader(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("File not correct");
	
		
		
	}

}
