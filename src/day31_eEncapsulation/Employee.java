package day31_eEncapsulation;

public class Employee {
	//Instance variables
	
	private String name;
	private int age;
	private String ssn;
	private char gender;
	private String job_title;
	private double salary;
	private boolean isHourLyEmployee;
	private double rate;
	
	
	
	public Employee () {}
	
	
	
	public Employee(String name, int age, String ssn, char gender, String job_title, double salary,
			boolean isHourLyEmployee, double rate) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.gender = gender;
		this.job_title = job_title;
		this.salary = salary;
		this.isHourLyEmployee = isHourLyEmployee;
		this.rate = rate;
	}



	public String getName() {
		
		return name;
		
	}
	
	public void setNmae(String name) {
		
		
		this.name = name;
		
		
	}
	public int getAge () {
		
		
		return age;
		
	}
	public void steAge(int age) {
		
		this.age = age;
	}
	
	public String getSSN() {
		
		return ssn;
		
		
	}
	public void setSSn(String ssn) {
		
		this.ssn = ssn;
	}
	public char getGender() {
		
		
		return gender;
		
	}
	public void setGender(char gender) {
		
		
		this.gender = gender;
		
		
	}
	public String GetJobTitle () {
		
		return job_title;
	}
	
	public void SetJobTitle(String job_title) {
		
		this.job_title = job_title;
		
	}
	public double getSalary () {
		
		return salary;
	}
	public void setSalary(double salary) {
		
		this.salary =salary;
	}
	public double calculateSalary() {
		
		double  paycheck = 0;
		
		if (isHourLyEmployee) {
			
			paycheck = rate * 2080;
			
			
			
		}else {
			
			paycheck = salary;
		}
		
		
		
		return paycheck;
		
		
	}
	   public String toString() {
           
           return "{// Employee \n\tname:"+name+""
                   + "\n\tage:"+age+""
                           + "\n\tssn:"+ssn+""
                           + "\n\tgender:"+gender+""
                           + "\n\tjob title:"+job_title+""
                           + "\n\tSalary:$"+salary+""
                                   + "\n}";
           
         
       }

}
