package day25_LocalDateTime;

import java.time.LocalDate;

public class LocalTime {
	public static void main(String[] args) {
		
		
		//LocalDate date = LocalDate.of(2019,1,1);
		
		
		
		LocalTime b = new LocalTime();
		
		b.HappayBirthday(2021, 12, 21);
		
		System.out.println(2021-1993);
		
		
		
	}
		public void  HappayBirthday (int year,int month,int day) {
			
			LocalDate today = LocalDate.now();
			LocalDate date = LocalDate.of(year, month, day);
			
			int month1= today.getMonthValue();
			
			int day1 = today.getDayOfMonth();
			
			int month2 = date.getMonthValue();
			int  day2 = date.getDayOfMonth();
			
			if(month1==month2 && day1==day2) {
				
				System.out.println("happy brithday");
			
		}else {
			
			System.out.println("we missed your birthday !");
		}
		
		
		
		}
		
		
		
		
	}


