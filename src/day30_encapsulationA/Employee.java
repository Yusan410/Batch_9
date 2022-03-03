package day30_encapsulationA;

public class Employee {
	// instance variable
	int employeeid;
	
	String jobtitle;
	
	double  salary;
	
	String name;
	
	
	//Default
	
	public Employee () {
		
	}
	
	// paramiter constructor
	
	
	public Employee(String fname,String fjobtitle , int femployeeid,double fsalary) {
		
		name = fname;
		
		jobtitle = fjobtitle;
		
		employeeid = femployeeid;
		
		salary = fsalary;
		
	}
	
	public void  ShowInfo() {
		
		System.out.println("employeeid: "+employeeid);
		System.out.println("jobtitle: "+jobtitle);
		
		System.out.println("salary: "+salary);
		
		System.out.println("name:" +name);
		
		}
		
	}
	


