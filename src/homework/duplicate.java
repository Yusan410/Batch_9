package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicate {
	
	public static void main(String[] args) {
		
	Integer arr[] = {1,2,3,3,4,4,5,6,7};
	
	
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
	
	List<Integer> unique = new ArrayList<>();
	
	for(Integer i : list) {
		
		System.out.println(i);
		
		if(!unique.contains(i)) {
			
			unique.add(i);
			
			
		}
	}
	
	System.out.println(unique);
	
	
	
		}
	}




