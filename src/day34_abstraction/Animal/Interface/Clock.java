package day34_abstraction.Animal.Interface;

import java.time.LocalDateTime;

public class Clock implements Alarm {
	
	public void showCurrentTime() {
		System.out.println(LocalDateTime.now());
		
		
		
	}

	@Override
	public void setAlarm() {
		
		System.out.println("8;30 PM");
		
	}
	
	
}


