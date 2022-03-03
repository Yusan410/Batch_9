package day31_eEncapsulation;

public class Circle {
	

	private double Area;
	private double perimeter;
	private double radius;
	private final double pi = 3.14;
	private double diameter;
	
	public Circle () {
		
		
		
	}
	public Circle(double radius) {
		
		this.radius = radius;
		this.diameter= 2*getRdius();
		
		this.Area =  calculatetarea();
		
		this.diameter=calculatepermiter();
		
	}
	
	public double getRdius() {
		return radius;
		
	}
	public double getArea() {
		return Area;
	}
	
	
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getPi() {
		return pi;
	}
	public void setRadius(double radius) {
		
		
	}
	
	
	public double calculatetarea() {
		
		
		return pi*getRdius()*getRdius();
		
	}
	
	public double calculatepermiter() {
		
		return pi*diameter;
	}

	@Override
	public String toString() {
		return "Circle [Area=" + Area + ", perimeter=" + perimeter + ", radius=" + radius + ", pi=" + pi + ", diameter="
				+ diameter + "]";
	}
	
	
	
}
		
		

