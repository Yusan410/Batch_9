package day11_NestedLoop;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) throws InterruptedException {
//		for (int j = 59;j>=0;j--) {
//			System.out.println(j);
//		}
//		
//		for (int i =2;i>0;i--) {
//			System.out.println("hello");
//		}
//		
	Scanner scan= new Scanner(System.in);
	System.out.println("how long do you want to take a break");
	
for(int i =scan.nextInt()-1;i>=0;i--) {
//	System.out.println(i+"minute");
	
	
	for(int j =59;j>=0;j--) {
		System.out.println(i+"minute"+j+"second");
		
			Thread.sleep(1000);
		scan.close();
	
	
}

}
	}
}
