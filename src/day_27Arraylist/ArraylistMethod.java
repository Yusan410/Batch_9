package day_27Arraylist;


import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMethod {
public static void main(String[] args) {
	
	
	
	
	
	
	
	
	
	
	
	ArrayList<String> element = new ArrayList<>(Arrays.asList("soda,milk,bread,egg,water"));
	
	
	System.out.println(element);
	
	
	
	ArrayList<Integer> even = new ArrayList<>();
	
	ArrayList<Integer> odd = new ArrayList<>();
	
for (int i = 1 ; i <101; i ++) {
	
	
	if(i %2 == 0 ) {
		
		even.add(i);
	}else {
		odd.add(i);
	}
	
	
	
	
}
     System.out.println(even);
     System.out.println(odd);
		
		
	}
	
	
       }







