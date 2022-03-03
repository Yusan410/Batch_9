package Day20_Method;

import java.util.Arrays;

public class SayHello {
public static void main(String[] args) {
	
	SayHello sh= new SayHello();
	
	
	
	String students[]= {"Samira","Yusan","irfan"};
	
	for (String zaid : students) {
		System.out.println(zaid);
		sh.printhello(zaid);
	}
	
}

public void printhello(String str) {
	
	

	System.out.println("hello"+str);
	
	
}
















}
