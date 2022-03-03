package day32_inheritance.concept.car.person;

public class Tester extends Employee {
	
	
	//*
	  //Create Tester class, make it subclass of Employee. 
	  //Tester IS A Employee
	  //name, age, gender, hourlyRate, jobTitle, ID
	        //create default and parameterized Constructor
	        //and make following method available. 
	      //  eat(), sleep(), work(), testing(),...
	
	
	
	public Tester() {
		
		
	}
	public Tester (String name , int age , char gender,String jobtitle,int ID,int hourlyrate) {
		
		              super.SetInfo(name, age, gender, jobtitle, ID, hourlyrate);
		              
		
		
		
		
	}
	
	
	
	public void testing() {
		
		System.out.println("Testing!");
	}
	
	
	
}
