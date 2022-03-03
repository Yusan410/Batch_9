package day_7switchStatment;

import java.util.Scanner;

public class MultiBranchIfStatment {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter yur sccore:");
		
		
		
		int score=scan.nextInt();
		char grade;
		
		
		
		
		
		
		
		if (score >= 0  && score <=100) {
			
			if (score >=90 && score<=100) {
				grade ='A';
		}else if (score>= 80 && score<=90) {
			grade ='B';
		}else if (score>=70 && score<=80) {
			grade = 'C';
			
		}else if (score>= 60 && score<= 70) {
			grade = 'D';
		} else  {
			grade = 'F';
		}
		System.out.println("your score is"+score);	
		
		System.out.println("your grade is "+grade);
		
		}else {
			System.out.println("Invalid score!"+score);
			
			
		scan.close();
		
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
