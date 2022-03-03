package day32_inheritance.concept.car.person;

public class Person {
	
	
	/*
	 Multilevel Inheritance in Java
	 
      	Person
	        name, age, gender
	        setInfo, eat(), sleep()
	        
	        
	 */
	
	
	
	
	String name;
	int age;
	char gender;
	

	public void SetInfo(String name , int age , char gender ) {
		
		
		         this.name=name;
		         this.age=age;
		         this.gender=gender;
	}
		
		
		
	
	public void sleep () {
		
		
		System.out.println("sleep early ");
		
		
		
	}
	public void eat () {
		
		
		
		System.out.println("Eat healthy");
		
		
	}
	
	
	@Override
	public String toString() {
		return "Person {name=" + name + ", age=" + age + ", gender=" + gender + "}";
	}
	
	
	
	}
	
	
	
	















