package day30_encapsulation.constructor;

public class DogObject {public static void main(String[] args) {
	
	
	Dog dog1 = new Dog();
	
	dog1.ShowInfo();
	
	Dog dog2 = new Dog("pitbill");
	dog2.ShowInfo();
	System.out.println("--------------");
	Dog dog3= new Dog ("husky","large",5,"black");
	
	dog3.ShowInfo();
	
	Dog dog4 = new Dog ("irfan","small",3,"brown");
	
	dog4.ShowInfo();
	
	

}
	
	
	
	


}
