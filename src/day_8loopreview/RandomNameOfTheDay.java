package day_8loopreview;

import java.util.Random;

public class RandomNameOfTheDay {

	public static void main(String[] args) {
	
		Random r =new Random();
		for(int i =0;i<=100;i++) {
		
		int month= r.nextInt(4);
		
		switch (month) {
		case 1 :
			System.out.println("janurary");
			break;
		case 2:
			
			System.out.println("februry");
			break;
		case 3 :

		
			System.out.println("march");
			break;
		case 4:
			
			
			System.out.println("april");
			
			break;
		}
	
		}
	}
}
               


		
		
		
		
		
		
		
		
		
		
		
	


