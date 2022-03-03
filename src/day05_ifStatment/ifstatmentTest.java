package day05_ifStatment;

public class ifstatmentTest {

	public static void main(String[] args) {
		
		
		int count =2;
		int total = 4;
		
		total = (count < 3)? 0 : total +count ;
		
		System.out.println(total);
		
	if(count <3) {
		total =9;
	}	else
		total =total+ count;
		
		System.out.println(total);
		
	// write a program to fin given number is positive or negative
		
		  int num1 =10;
		  int num2= -5;
		if(num1<10) {
		total=0;
		}else
			total=num2+num1;
		System.out.println(total);
		
        int num3=9;
		
		String message="";
		System.out.println(message);
		if (num3 < 9) {
	
			
			System.out.println(num3+"is positie");
		}else {
		System.out.println(num3+"is negative");
		
		
		double overdrawnPenalty =8.0;
		double interestRate = 0.02;
		double balance;
		System.out.println("Enter your checking account balance:$");
	
		
		
		
		balance =10000;
		System.out.println("oroiginal balance $"+balance);
		
		if(balance >=10000)
			balance = balance +(interestRate * balance)/12;
		
		else 
			balance = balance - overdrawnPenalty;
		
		System.out.println("your new balance is $"+balance);
		
		
		
		
		
		
		
		
		}	
	
		
			
	}


}