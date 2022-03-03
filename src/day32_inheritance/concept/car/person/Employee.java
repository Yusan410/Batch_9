package day32_inheritance.concept.car.person;

public class Employee extends Person {
	
	
	/*
	  Create Employee class, make it subclass of Person. 
	  Employee IS A Person
	  
	  name, age, gender, hourlyRate, jobTitle, ID
	        setInfo, eat(), sleep(), work()
	 */
	
int hourlyrate;
String jobtitle;
int ID;


public Employee () {
	
	
	
	
}
public void SetInfo(String name , int age , char gender,String jobtitle,int ID,int hourlyrate) {
                   
	               
	                this.jobtitle=jobtitle;
	                this.ID=ID;
	                this.hourlyrate=hourlyrate;
	                this.name=name;
	                this.age=age;
	                this.gender=gender;

   }
public void work() {
	
	
	
	System.out.println(": works at Apple Inc");
	
	
	
	
	
}
@Override
public String toString() {
	return "Employee [hourlyrate=" + hourlyrate + ", jobtitle=" + jobtitle + ", ID=" + ID + ", name=" + name + ", age="
			+ age + ", gender=" + gender + "]";
}

















}