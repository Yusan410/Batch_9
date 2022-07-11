package day30_encapsulationA;

public class Google {
	public static void main(String[] args) {

		Employee yusan = new Employee("Yusan","Engineer", 30001,13000);
		
		
		yusan.ShowInfo();
		
		Employee Sal = new Employee ("Sal","SDET",30002,18000);
		
		Sal.ShowInfo();
		
		Employee nur = new Employee ("nur","Software",30003,15000);
		
		nur.ShowInfo();
		
		Employee ee = new Employee("Nur","SDET",833288,3000);
		
		ee.ShowInfo();
		
	}
	
	
	
	
	
	
	

}
