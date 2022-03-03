package day32_inheritance.concept.car.person;

public class Developer extends Employee{
	
	/*
	   Create Developer class, make it subclass of Employee. 
	   Developer IS A Employee
	   name, age, gender, hourlyRate, jobTitle, ID
	        create default and parameterized Constructor
	        and make following method available. 
	           eat(), sleep(), work(), code()...
	 */
	
	
	public Developer() {
		
		
		
	}	
		public  Developer(String name , int age , char gender,String jobtitle,int ID,int hourlyrate) {
			
			super.SetInfo( name, age, gender, jobtitle, ID, hourlyrate);
			
           
			
			
		}
		public void code() {
			
			
			System.out.println("Coding");
			
			
			
		}
		
		public void eat() {
			
			System.out.println("Etting pizza");
			
		
		}
		
		public void sleep () {
			
			System.out.println("sleep 4 hour");
			
			
			
		}
		@Override
		public String toString() {
			return "Developer [hourlyrate=" + hourlyrate + ", jobtitle=" + jobtitle + ", ID=" + ID + ", name=" + name
					+ ", age=" + age + ", gender=" + gender + "]";
		}
		
}
	
	
	
	
	
	

		


