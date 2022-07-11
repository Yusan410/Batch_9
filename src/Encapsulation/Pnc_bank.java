package Encapsulation;

public class Pnc_bank {
	
	public static void main(String[] args) {
		              
		
		Employee p1 = new Employee(); //Calling default constructor of eoployee class
		
//		p1.age=30;
		p1.setName("Ali");
		p1.setAge(27);
		p1.setJob_title("QA_Tester");
		p1.setGender('M');
		p1.setSalary(85000);
		p1.setSsn("123-456-789");
		
		//System.out.println(p1.toString());
		
		System.out.println(p1.getName());
		

		
		
		Employee p2 = new Employee("Yusan",28,"SDET",0,'M',"123-34555",true,85);
		
		System.out.println(p2.calculatesalary());
		
		
		
		
		
	}
	
	
	

}
