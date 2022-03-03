package day35_exceptions;

public class ThrowException {
	
	
	
	
	
	public void wait5second() {
		System.out.println("5 second delay");
		
		try {
			Thread.sleep(5000);//checked exception;
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		
		System.out.println("End");
	}
	public void wait3second() throws InterruptedException {
		System.out.println("3 second delay");
		Thread.sleep(3000);
		System.out.println("End");
	}
	
	public void methodC() {
		
		
		try {
			wait3second();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void methodD() throws InterruptedException {
	
	wait3second();
}
}
