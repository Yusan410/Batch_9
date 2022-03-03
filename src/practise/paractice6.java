package practise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class paractice6 {
	public static void main(String[] args) {
		//local date time formatter
		
		  /*
        LocalDate:
            year: yyyy
            month: MM (number), MMM(three letters of month), MMMM(full name)
            days: dd
            name of day: E(three letters) , EEEE (full name)
        LocalTime:
            hours: hh
            minutes: mm
            seconds: ss
            am/pm: a
         */
		
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
        
        
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(df));
        
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEE");
        
        System.out.println(today.format(df2));
        
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("MMMddyyyy, EEE");
        
        System.out.println(today.format(df3));
        
        DateTimeFormatter df5 = DateTimeFormatter.ofPattern("yyyy-MMM-dd,E");
        
        System.out.println(today.format(df5));
        
        LocalDateTime dd = LocalDateTime.now();
        
        System.out.println(dd);
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
        
        System.out.println(dd.format(dtf1));
        
        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("hh:mm a");
        
        System.out.println(dd.format(tf1));
        
        DateTimeFormatter dfc = DateTimeFormatter.ofPattern("MM/dd/yyyy'T' hh:mm , a");
        
        System.out.println(dd.format(dfc));
	}

}
