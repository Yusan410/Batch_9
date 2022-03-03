package day31_eEncapsulation;

public class Walmart {
	public static void main(String[] args) {
		
		
		Person s1 = new Person("Yusan",28,'M',12000,"832-349-2218");
		
		
		
		System.out.println(s1.getAge());
		System.out.println(s1.getGender());
		System.out.println(s1.getName());
		System.out.println(s1.getPhone());
		System.out.println(s1.getSalary());
		System.out.println("-------------------");
		System.out.println(s1.toString());
		
		
	}

}
