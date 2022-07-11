package internationalWomensDay;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMap {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1,"x"); map.put(2,"y"); map.put(3,"z");

		map.put(3,"A");map.put(4,"B");map.put(5,"C");map.put(6,"D");

		//1. Find the common keys. Once you find the common keys, print out its respective values.
		
		for(Entry e: map.entrySet()) {
			
			System.out.println(e);
		}
		
	      HashMap<Integer, String> HM1 = new HashMap<>();
	        HashMap<Integer, String> HM2 = new HashMap<>();
	        
	        HM1.put(1,"x"); 
	        HM1.put(2,"y"); 
	        HM1.put(3,"z");
	        
	        HM2.put(3,"A");
	        HM2.put(4,"B");
	        HM2.put(5,"C");
	        HM2.put(6,"D");
	        
	        Set<Map.Entry<Integer, String>> HM1_Set = HM1.entrySet();
	        
	        for(Map.Entry<Integer, String> m: HM1_Set) 
	            if(HM2.containsKey(m.getKey())) {
	                System.out.println(m.getKey() + m.getValue());
	                System.out.println(m.getKey() + HM2.get(m.getKey()));                
	            }
	    }
	}
			
		
	


