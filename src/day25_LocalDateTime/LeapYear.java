package day25_LocalDateTime;

import java.time.LocalDate;

public class LeapYear {
	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2019, 10, 29);

		System.out.println(date1.isLeapYear());
		
		System.out.println(date1.getDayOfMonth());
		
		System.out.println(date1.getDayOfYear());
		LocalDate pruductWarrantyex = date1.plusYears(3);

		System.out.println(pruductWarrantyex);

		LocalDate today = LocalDate.now();

		if (today.isBefore(pruductWarrantyex)) {

			System.out.println("you still in warranty");

		} else {

			System.out.println("buy the pruduct again");
		}

	}
}
