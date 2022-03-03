package day32_inheritance.concept.books;

public class BookObject {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.author = "Yusan";
		book1.title = "java";
		book1.type = "programming";
		book1.price = 42.3;
		
		System.out.println("Title: "+book1.title);
		System.out.println("Author :"+book1.author);
		System.out.println("Type :"+book1.type);
		System.out.println("Price :"+book1.price);
		System.out.println("----------------");
		AudioBook book2 =new AudioBook();
		
		book2.author = "Irfan";
		book2.title = "the 10X Rule";
		book2.type = "programming";
		book2.price = 39.66;
		book2.lenght = 4;
		book2.narrator = "jhon";
		
		book2.listen();
		System.out.println("-------------------------");
		
		Ebook b3 = new Ebook();
		
		b3.title = "atomic Habits";
		b3.author = "James clear";
		b3.price = 13.99;
		b3.page = 354;
		b3.size = 354;
		
		b3.readBook();
		
				}

}
