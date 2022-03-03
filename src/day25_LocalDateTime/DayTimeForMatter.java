package day25_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DayTimeForMatter {
	
	
	public static void main(String[] args) {
		
		
		
	       DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
	        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
	        
	        LocalDate today = LocalDate.now();
	        
	       System.out.println(today.format(df));
	       
	       LocalDateTime time = LocalDateTime.now();
	       
	       System.out.println(time);
	       
	     DateTimeFormatter df1 = DateTimeFormatter.ofPattern("hh:mm a");
	     
	     System.out.println(time.format(df1));
	     
	     DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy , E hh:mm a");
	     System.out.println(time.format(df2));
	}
	
	

}
