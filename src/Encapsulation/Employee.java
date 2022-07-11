package Encapsulation;

public class Employee {

	//Class_1 Employee
	
	
	//oops concept object orinated programming;
	
	
	
	//getter and setter // getter is return value ;  setter is update the variable ;
	
	//Encapsulation simply mean is binding objact state (fields) and behavior method together;
	
	//1.Benefit of encapsolation is can be make class read only or write only
	
	//2.class can have total control what is store it fields;
	
	
	// Instance variables;
	private String name;
	private int age;
	private String job_title;
	private double salary;
	private char gender;
	private String ssn;
	private boolean hourlyEmployee;
	private double rate;
	
	
	
public Employee() {
	
	
}


		
		
		
	
	public Employee(String name, int age, String job_title, double salary, char gender, String ssn, boolean hourlyEmployee,
		double rate) {
	
	this.name = name;
	this.age = age;
	this.job_title = job_title;
	this.salary = salary;
	this.gender = gender;
	this.ssn = ssn;
	this.hourlyEmployee = hourlyEmployee;
	this.rate = rate;
}






	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", job_title=" + job_title + ", salary=" + salary
				+ ", gender=" + gender + ", ssn=" + ssn + "]";
		
	}





	public String getName() {
		
		
		
		return name;
	
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getJob_title() {
		return job_title;
	}


	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public double calculatesalary() {
		
		double paycheck = 0;
		
		if(hourlyEmployee) {
			
			paycheck = rate*2080;
		}else {
			
			paycheck = salary;
		}
		
		return paycheck;
		
		
	}
}
