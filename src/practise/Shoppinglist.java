package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Shoppinglist {
	
	public static void main(String[] args) {
		
		
		/*
		create a class called ShoppingList
					create 5 objects of Item and store them into ArrayList of Items
					calculate the total cost of all Items in the list
		 */
		
		Item orang = new Item("Orange",3,5);
		Item apple = new Item("Apple",2,5);
		Item coffe = new Item ("coffe",4,5);
		
		
		ArrayList<Item> str = new ArrayList<>(Arrays.asList(orang,apple,coffe));
	for(Item item: str) {
		System.out.println(item);
		double totalcost = 0;
		//System.out.println(item.toString());
		
		totalcost += item.cost();
		System.out.println(item.toString());
		System.out.println("---------------");
		
		System.out.println(totalcost+"totalcost");
		
	}
	
	
	
		}
	
		
		
		
	}


