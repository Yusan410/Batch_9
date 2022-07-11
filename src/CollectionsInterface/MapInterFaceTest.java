package CollectionsInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterFaceTest {
	
	//class_6
	
	public static void main(String[] args) {
		
		
		//key value per  key always unique value maybe duplicate
		
		//Hashmap and linked HashMap null key and value 
		
		//tree map can not allowed null key and value
		
		
		
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(100, "amit");
		map.put(101, "rahul");
		
		map.put(102, "Vijay");
		
		System.out.println(map.get(101));
		
		
		HashMap<String,Long> phonnum = new HashMap<>();
		
		phonnum.put("Yusan", 8323492218l);
		phonnum.put("samira", 83232492218l);
		
		System.out.println(phonnum.get("Yusan"));
		
		for(Map.Entry m : phonnum.entrySet()) {
			
			//System.out.println(m);
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		
		}
	

}
