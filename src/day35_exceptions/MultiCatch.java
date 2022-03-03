package day35_exceptions;

import java.nio.channels.spi.AsynchronousChannelProvider;

public class MultiCatch {
	public static void main(String[] args) {
		
		
		String str = "Techcircle";
		
		try {
		
		//char lastChar = str.charAt(9);
		
		char lastChar = str.charAt(str.length()-1);
		
		char chars[]= str.toCharArray();
	
		System.out.println(lastChar);
		
		for (int i = 0 ; i <= chars.length; i ++) {
			
			System.out.println(chars[i]);
			
			
			
		}
		}catch(ArrayIndexOutOfBoundsException e ) {
		
			//e.printStackTrace();
			System.out.println("Array index issue");
			
		}catch(RuntimeException e) {
			
			e.printStackTrace();
		}catch (Exception a ) {
			a.printStackTrace();
		}catch(Throwable e ) {
			
			e.printStackTrace();
		}finally {//finally block always run
			
			System.out.println("Clean up code here");
		}
	}

}
