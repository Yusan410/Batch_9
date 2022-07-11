package inheritance.book;

public class BookObject {
	
	public static void main(String[] args) {
		
		
		
		Book p1 = new Book();
		
		p1.author="Ali";
		p1.price=100;
		p1.title="SDET";
		p1.type="Book";
		
		
		System.out.println(p1.author);
		System.out.println(p1.price);
		System.out.println(p1.title);
		System.out.println(p1.type);
		
		AudioBook bb = new AudioBook();
		
		bb.author="Ali";
		bb.price=100;
		bb.title="SDET";
		bb.type="AudioBook";
		bb.narrator="eeee";
		bb.lenght=4;
		bb.listen();
		System.out.println(bb.author);
		System.out.println(bb.lenght);
		System.out.println(bb.narrator);
		System.out.println(bb.price);
		System.out.println(bb.title);
		System.out.println(bb.type);
		
		Ebook e = new Ebook();
		e.author="yusan";
		e.page=234;
		e.price=50;
		e.title="Orcal";
		e.type="Ebook";
		e.readBook();
		
	}
	
	
	
	
	

}
