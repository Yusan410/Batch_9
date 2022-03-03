package practise;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class localdate {
	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.of(2021, 12, 12);
		System.out.println("date is"+date);
		LocalDateTime dateTime = date.atTime(20, 13, 30);
		System.out.println("time is:"+dateTime);
		
		
		
		LocalDate Yesterday = date.minusDays(1);
		
		System.out.println(Yesterday);
	}
	
	

}
