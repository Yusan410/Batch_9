package techcirecle.batch9.java;

public class Homework {

	public static void main(String[] args) {
		

			
				
				/*4, Write program that can print out the name of the day based on the number 1 ~ 7
				 number = 1  // 1 ~ 7
				 output:
				 	Monday
			 	number = 5
			 	output:
				 	Friday*/
				
				int number = 5;
				String nameOfDay = " ";
				int numbercheck = number >= 1 && number <= 7 ? 1 : 0;
				
				if (numbercheck == 1) {
					if (number == 1) {
						nameOfDay = "Monday";
					}
					if (number == 2) {
						nameOfDay = "Tuesday";
					}
					if (number == 3) {
						nameOfDay = "Wednesday";
					}
					if (number == 3) {
						nameOfDay = "Wednesday";
					}
					if (number == 4) {
						nameOfDay = "Thursday";
					}
					if (number == 5) {
						nameOfDay = "Friday";
					}
					if (number == 6) {
						nameOfDay = "Saturday";
					}
					if (number == 7) {
						nameOfDay = "Sunday";
					}
					System.out.println(nameOfDay);
				}else {
					System.err.println("Invalid number, day must be between 1 and 7");
				} 
			}
		
	}
