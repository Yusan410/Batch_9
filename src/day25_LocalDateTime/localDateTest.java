package day25_LocalDateTime;

import java.time.LocalDate;

public class localDateTest {
public static void main(String[] args) {
	
	//               yyy-mm-dd
	 
	LocalDate date = LocalDate.now();
	LocalDate yesterday = date.minusDays(1);
	LocalDate tomorrow = date.plusDays(1);
	LocalDate today = LocalDate.now();
	
	System.out.println("Today;"+date);
	
	System.out.println("yesterday:"+yesterday);
	System.out.println("tomorrow:"+tomorrow);
	
	LocalDate experationDate = date.plusDays(40);
	
	LocalDate date2 = date.plusDays(40);
	//System.out.println(date2);
	
	System.out.println(experationDate);
	System.out.println(date2);
	//System.out.println(date.isAfter(experationDate));
	
	if (date2.isAfter(experationDate)) {
		
		System.out.println("delete application");
	}else {
		
		System.out.println("complete your application");
	}
		
	
}
}
