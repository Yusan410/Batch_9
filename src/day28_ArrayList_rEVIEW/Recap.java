package day28_ArrayList_rEVIEW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		
		
		
		ArrayList<Double> list1 = new ArrayList<>();
		
		list1.add(0.2);
		list1.add(9.9);
		
		ArrayList<Double> list2 = new ArrayList<>(Arrays.asList(1.2,1.2,3.3,4.5,5.5));

		list1.addAll(1,list2);
		//System.out.println(list1);
		
		
	//Iterator itr = list1.iterator();
	
	for (int i = 0 ; i < list1.size();i++) {
		
		
		//System.out.print(list1.get(i));
		
		if (list1.get(i)>3) {
			
			list1.remove(i);
		}
		
		
		
	}
	//System.out.println(list1);	
	
	
	Iterator itr = list1.iterator();
	
	while(itr.hasNext()) {
		
		
		double d = (double)itr.next();
		
		if(d<3){
			
			itr.remove();
			
		}
		

		
	}
	
	System.out.println(list1);
			
		}
		

		
		
	}


