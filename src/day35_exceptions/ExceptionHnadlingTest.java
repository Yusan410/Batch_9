package day35_exceptions;

public class ExceptionHnadlingTest {
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		ThrowException e = new ThrowException();
		
		e.wait5second();
		//e.wait3second();
		
		e.methodC();
		
		e.methodD();
	}

}
