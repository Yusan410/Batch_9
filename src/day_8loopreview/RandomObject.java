package day_8loopreview;

import java.util.Random;

public class RandomObject {

	public static void main(String[] args) {
		// Random  
		
		Random r = new Random();
		
				System.out.println(r.nextInt(10));
		
		
		
		boolean result = r.nextBoolean();
		System.out.println(result);
	
		// 703-123-1234
		
		System.out.print(r.nextInt(703));
		System.out.print(r.nextInt(999));
		System.out.print(r.nextInt(9999));
		
		
		
		for(int i = 0; i<10;i++) {
			System.out.print(r.nextInt(703));
			System.out.print(r.nextInt(887));
			System.out.print(r.nextInt(459));
			
			System.out.println();
			System.out.println();
		}
		
		
		
		
	}

}
