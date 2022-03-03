package day34_abstraction.Animal.Interface;

//Interface

public class Iphone implements Alarm {
	
	public void call() {
		
		System.out.println("Callling Techcircle");
	}
	
	public void attendingZoomMetting() {
		
		
		System.out.println("Iphone Zoom app is processing!");
	}
	
	public void  setAlarm() {
		
		System.out.println("Iphone:   setting an alarm at 6 AM");
	}

}
