package internationalWomensDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Duplicattttttt {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> name = new ArrayList<>();
		
		
		name.add("hello");
		name.add("hello");
		name.add("hello");
		name.add("wolrd");
		name.add("wolrd");
		
		ArrayList<String> unique = new ArrayList<>();
		
		for(String nam : name) {
			
			if(!unique.contains(nam)) {
				
				
				unique.add(nam);
			}
		}
		
		System.out.println(unique);
		
		
		int arr[] = {1,1,2,2,3,3,4,4,5};
		
		HashSet<Integer> a = new HashSet<>();
		
		for(Integer numm: arr) {
			
			
			a.add(numm);
			
			
		}
		
		
		
		
//		a.add(1);
//		a.add(1);
//		a.add(2);
//		a.add(2);
//		a.add(3);
//		a.add(3);
//		a.add(4);
//		a.add(4);
		
		
		System.out.println(a);
		
		HashSet<String> b = new HashSet<>();
		
		for(String nam : name) {
			
			b.add(nam);
			
			
		}
		
		System.out.println(b);

	}
	
	

}
