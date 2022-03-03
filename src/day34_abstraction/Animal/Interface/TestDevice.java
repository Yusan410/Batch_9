package day34_abstraction.Animal.Interface;

import java.util.ArrayList;

public class TestDevice {
	public static void main(String[] args) {
		
		Iphone a = new Iphone();
		
		a.attendingZoomMetting();
		a.call();

		a.setAlarm();
		
		Alexa b = new Alexa();
		
		b.alexaWhatTimesIsIt();
		b.setAlarm();
		
		Clock c = new Clock();
		
		c.showCurrentTime();
		c.setAlarm();
		//Interfce
		Alarm x = new Iphone(); 
		x.setAlarm();
		System.out.println(x.size);
		
		System.out.println("===================");
		
		testAlarm(a);
		testAlarm(b);
		testAlarm(c);
		
		ArrayList<Alarm> list = new ArrayList<>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println("=================");
		for (int i = 0 ; i < list.size(); i ++) {
			
			
			
			System.out.println(i);
			
			list.get(i).setAlarm();
			
			System.out.println(list.get(i).size);
			
			
		}
		
		
		
	}
	
	public static void testAlarm(Alarm c ) {
		
		
		c.setAlarm();
		
		
	}

}
