package practise;

public class Item {
	
	/*
	create a class called Item
				instance variables:
					name, unitPrice, quantity
				add a constructor that can initialize the fields
				instance methods:
					calcCost(): returns the total cost as double
					
								hint: totalCost = quantity * unitPrice
					toString(): returns the name, unit price, 
					             quantity and total cost info as calculated by calcCost()
	 */
	
	
	
	
	/*
	create a class called ShoppingList
				create 5 objects of Item and store them into ArrayList of Items
				calculate the total cost of all Items in the list
	 */
	String name;
	int unitprice;
	int quantity;

	
	public Item() {
		
		
	}
	
	public Item(String name, int unitprice, int quantity) {
		
		this.name = name;
		this.unitprice = unitprice;
		this.quantity = quantity*unitprice;
	}
	
	
	




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

public double cost () {
	
	return quantity * unitprice;
	
	
	
	
	
	
}

@Override
public String toString() {
	return "Item [name=" + name + ", unitprice=" + unitprice + ", quantity=" + quantity + "]";
}


	
	

}
