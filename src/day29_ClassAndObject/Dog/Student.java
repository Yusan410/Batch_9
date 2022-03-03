package day29_ClassAndObject.Dog;

public class Student {
	
	
	
	String name;
	int age;
	String color;
	String sex;
	
	
	public void eat () {
		
		System.out.println(name + " Eatting");
	}
	public void run () {
		
		
		System.out.println(name + " Running");
		
	}
	public void drink () {
		
		System.out.println(name + " Drinking");
	}
	public void getInfo() {
		
		
		System.out.println("Name: "+name + "\nAge:"+ age + "\nColor:"+color +"\nSex:"+ sex  );
		
		
	}

}
