package day29_ClassAndObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		LocalDate today = LocalDate.now();
		
		//System.out.println(today);
		
		
ArrayList <LocalDate> date = new ArrayList<>();

date.add(today);

System.out.println(date);

date.add(LocalDate.of(1999, 10, 10));
date.add(LocalDate.of(2000, 10, 10));
date.add(LocalDate.of(2001, 10, 10));
date.add(LocalDate.of(2002, 10, 10));
date.add(LocalDate.of(2003, 10, 10));

Iterator itr = date.iterator();

while (itr.hasNext()) {
	
	System.out.println(itr.next());
	
	LocalDate d = (LocalDate) itr.next();
	
	if(d.isBefore(LocalDate.of(2001, 10, 10))) {
		
		itr.remove();
	}
			
	
	
		
	}
System.out.println(date);















	
}


	}


