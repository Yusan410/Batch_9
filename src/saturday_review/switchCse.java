package saturday_review;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class switchCse {

	public static void main(String[] args) {
		

		
		
		
		
	DateTimeFormatter tf = DateTimeFormatter.ofPattern("MMMM/dd/yyyy/EEEE");
	
	LocalDateTime today = LocalDateTime.now();
	
	System.out.println(today);
	
	System.out.println(today.format(tf));
			LocalDate day = LocalDate.now();
			
			System.out.println(day);
	

			DateTimeFormatter tt = DateTimeFormatter.ofPattern("hh:mm a");
			
			
			System.out.println(today.format(tt));
			
			DateTimeFormatter kk = DateTimeFormatter.ofPattern("M/dd/yyy/E hh:mm a");
			
			
			
			
			
			System.out.println(today.format(kk));
			
			DateTimeFormatter ff = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
			
			
			
			
			
			System.out.println(today.format(ff));
			
}
}
		