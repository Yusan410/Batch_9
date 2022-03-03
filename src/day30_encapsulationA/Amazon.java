package day30_encapsulationA;

public class Amazon {
	public static void main(String[] args) {
		
		
		Employee ss = new Employee();
		
		ss.ShowInfo();
		
		ss.employeeid = 200001;
		
		ss.jobtitle= "sdet";
		
		ss.salary = 1500000;
		
		ss.name = "Yusan";
		ss.ShowInfo();
		//calling parametier constructor of the employee class
		Employee henry = new Employee ("henry","enginerr",20002,180000);
		System.out.println("------------");
		henry.ShowInfo();
		
		
		Employee Samira = new Employee("Samira","doctor",20005,190000);
		System.out.println("-----------");
		Samira.ShowInfo();
		//System.out.println("-----------");
	}

}
