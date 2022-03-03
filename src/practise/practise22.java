package practise;

import java.util.Scanner;

public class practise22 {
	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("how long do you wanna take break");
		
		
		for(int i = scan.nextInt()-1; i>=0; i --) {
			
			 
			for (int j = 59; j >=0; j --) {
				
				System.out.println(i+"minute"+j+"second");
				Thread.sleep(1000);
			}
			scan.close();
		}
		
		
	}

}
