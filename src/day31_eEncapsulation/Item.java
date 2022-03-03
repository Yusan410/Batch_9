package day31_eEncapsulation;

public class Item {
	//*
   //create a class called Item
               // instance variables:
                    //name, unitPrice, quantity
               // add a constructor that can initialize the fields
               // instance methods:
                   // calcCost(): returns the total cost as double
private String name;
private double unitprice;
private double quantity;

public Item () {
	
}

public Item(String name, double unitprice, double quantity) {
	
	this.name = name;
	this.unitprice = unitprice;
	this.quantity = quantity;
	
	

		
	}	
		
	
	
	


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getUnitprice() {
	return unitprice;
}

public void setUnitprice(double unitprice) {
	this.unitprice = unitprice;
}

public double getQuantity() {
	return quantity;
}

public void setQuantity(double quantity) {
	this.quantity = quantity;
}
public double cost () {
	
	return quantity*unitprice;
	
	
	
	
}

@Override
public String toString() {
	return "Item [name=" + name + ", unitprice=" + unitprice + ", quantity=" + quantity + "]";
}

	
}

