package inheritance.book;

public class AudioBook extends Book {
	
	int lenght;
	String narrator;
	
	public void listen() {
		type = "Audiobook";
		System.out.println("Listening audio book :");
		System.out.println("Ttitle: "+title);
		System.out.println("Author: "+author);
		System.out.println("lenght: "+lenght);
		System.out.println("narrator: "+narrator);
		System.out.println("price: "+price);
		System.out.println("Type: "+ type);
	}

}
