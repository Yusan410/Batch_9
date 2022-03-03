package day16_Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
	
		
		
String fruits[]= {"Apple","Orang","Pear","Banana"};

String expectedArray[]= {"Banana","Pear","Orange","Apple"};					
		
	System.out.println(fruits.length);	
	
	String fruits2[]=new String [fruits.length];
		
	System.out.println(fruits2.length);
	
	System.out.println(fruits2[0]);
	//default vallue is null
	
	fruits2[0]=fruits[3];
	fruits2[1]=fruits[2];
	fruits2[2]=fruits[1];
	fruits2[3]=fruits[0];
	System.out.print(fruits2[0]+",");
	System.out.print(fruits2[1]+",");
	System.out.print(fruits2[2]+",");
	System.out.print(fruits2[3]);
	
	
	
	
	
	}

}
