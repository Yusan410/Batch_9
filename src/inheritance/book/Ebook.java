package inheritance.book;

public class Ebook extends Book {
	
	int size;
	int page;
		
	public void readBook() {
		type = "e-book";
		System.out.println("Reading "+type);
		System.out.println("Ttitle: "+title);
		System.out.println("Author: "+author);
		System.out.println("size: "+size);
		System.out.println("page: "+page);
		System.out.println("price: "+price);
	}

}
