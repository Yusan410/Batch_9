package Encapsulation;

public class Person {
	
	
	private String name;
	private int age;
	private String phonnum;
	private char gender;
	
	
	public Person(String name, int age, String phonnum, char gender) {
		
		this.name = name;
		this.age = age;
		this.phonnum = phonnum;
		this.gender = gender;
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
	public String getPhonnum() {
		return phonnum;
	}
	public void setPhonnum(String phonnum) {
		this.phonnum = phonnum;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phonnum=" + phonnum + ", gender=" + gender + "]";
	}
	
	
	

}
