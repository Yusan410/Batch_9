package day31_eEncapsulation;

public class PNC_Bank {

	public static void main(String[] args) {
		
		
		Employee p1 = new Employee(); // calling default constructor
		
		//p1.age = 30;
		//p1.gender = 'F';
		//p1.job_title = "Qa automation";
		//p1.name = "Irfan";
		//p1.salary = 120000;
		//p1.ssn = "123-123-3444";
		
		p1.steAge(20);
		p1.setNmae("Samira");
		p1.SetJobTitle("enginer");
		p1.setGender('F');
		p1.setSSn("123-334-3344");
		p1.setSalary(120000);
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		System.out.println(p1.GetJobTitle());
		System.out.println(p1.getSalary());
		System.out.println(p1.getGender());
		
		System.out.println(p1.toString());
		
		//p1.age = 18;
		//p1.gender = 'F';
		//p1.job_title = "Qa automation";
		//p1.name = "Irfan";
		//p1.salary = 120000;
		//p1.ssn = "123-123-3444";
		
		Employee p2 = new Employee ("Yusan",20,"123-123-1234",'M',"Enginerr",50000,false,0);
	
		Employee p3 = new Employee ("Samira",26,"123-123-1254",'F',"software",0,true,55);
		System.out.println("--------------------");
		System.out.println(p1.calculateSalary());
		System.out.println(p2.calculateSalary());
		System.out.println(p3.calculateSalary());
		

	}

}
