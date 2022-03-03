package day32_inheritance.concept.car;

public class BMW extends Car{
	
	
	

    public BMW() {
        brand = "BMW";
    }
    
    public BMW(String model,String color,int year, int miles, double price) {
        setInfo("BMW",model,color,"Germany",year,miles,price);
    }
    
    
    
    boolean isExpensive = true;
    boolean isLuxury = true;
    boolean breaksAlot = true;
    
    public void race() {
        System.out.println(brand + " "+ model +" is racing!");
    }
    
}
	
 
	

