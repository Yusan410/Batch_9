package day31_eEncapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObject {
	public static void main(String[] args) {
		
		Item i1 = new Item ("Apple",1.23,6);
		Item i2 = new Item ("Water",0.88,25);
		Item i3 = new Item ("Orange",1.45,9);
		Item i4 = new Item ("Tea",3.45,2);
		
		
		ArrayList<Item> list = new ArrayList<>(Arrays.asList(i1,i2,i3,i4));
		
		
		double totalcost = 0;
		
		for (Item item : list) {
			
			System.out.println(item.toString());
			
			totalcost += item.cost();
			
			System.out.println("--------------------");
			
		}
		
		System.out.println("totalcost"+totalcost);
		
		
		
	}
	
}
