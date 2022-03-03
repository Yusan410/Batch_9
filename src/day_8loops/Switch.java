package day_8loops;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	
	//write to program number between 1 to 12
	//print name of the month 
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter number of the month");
	int month= scanner.nextInt();
	
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
		
	
	default: System.out.println("invaild month");
	
		break;
		
	}
	
	scanner .close();


	
	
	
	

	


}
	
}
	



	



