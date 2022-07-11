package practise;

import java.util.Scanner;

public class Swicth {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your browser");
		
	String browser = scan.next();
		
		
		//int nums = 95;
		
		
		switch(browser) {
		
		
		case "Safari" :
			System.out.println("This is safari");
			
			break;
			
		case "FireFox":
			
			System.out.println("this is firefox");
			break;
			
		case "Chrome":
			
			System.out.println("This is Chrome");
			
			break;
			
		case "Ie":
			
			System.out.println("this is Ie");
			
			
			break;
			
			default:
				
				System.out.println("Please enter correct browser");
				
				break;
			
		
		
		
		}
		
		scan.close();
			
		}
	}


