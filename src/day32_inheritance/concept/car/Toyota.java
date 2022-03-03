package day32_inheritance.concept.car;

public class Toyota extends Car{
	
	boolean isAfordbale = true;
	
	
	 public Toyota() {
	        brand = "Toyota";
	    }
	    
	    public Toyota(String model,String color,int year, int miles, double price) {
	        setInfo("Toyota",model,color,"Japan",year,miles,price);
	    }
	    
	    
	    
	    

	    
	    
	}


