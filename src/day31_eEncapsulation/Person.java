package day31_eEncapsulation;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	private double salary;
	private String phone;
	
	
	public Person(String name, int age, char gender, double salary, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.phone = phone;
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


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

   public String toString() {
           
           return "{// Employee \n\tname:"+name+""
                   + "\n\tage:"+age+""
                           + "\n\tssn:"+name+""
                           + "\n\tgender:"+gender+""
                           + "\n\tjob title:"+phone+""
                           + "\n\tSalary:$"+salary+""
                                   + "\n}";
           
         
       }

	
	
	
	
	
	
	
	
	
	
}
