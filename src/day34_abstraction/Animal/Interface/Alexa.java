package day34_abstraction.Animal.Interface;

import java.time.LocalDateTime;

//Interface

public class Alexa implements Alarm {
	
	
	public void alexaWhatTimesIsIt() {
		
		
		System.out.println("It is<"+LocalDateTime.now()+">");
		
		
		
		
	
		
	}
	public void setAlarm() {
		
		
		System.out.println("Alexa:  setting an alarm at 6 AM");
	}

}
