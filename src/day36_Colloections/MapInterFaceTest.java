package day36_Colloections;

import java.util.HashMap;
import java.util.Map;

public class MapInterFaceTest {
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * /Map//
		 */
		
	HashMap<Integer,String> map = new HashMap<>	();
	
	map.put(100, "Amit");
	
	map.put(101, "Vijay");
	
	map.put(102, "rahul");
		
		
	System.out.println(map.get(101));
	System.out.println(map.get(102));
	
	HashMap<String,Long>  number = new HashMap<>();
	
	number.put("Samira", 7035859990l);
	number.put("Ali",   8025859990l);
	number.put("Irfan", 7035832990l);
	
	
	System.out.println(number.get("Ali"));
	
	System.out.println(number.get("Irfan"));
		
		
		
		
		
		for (Map.Entry m:number.entrySet()) {
			
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
