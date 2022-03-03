package day_8loops;

public class BrowserSelection {

	public static void main(String[] args) {
	
		String targetBrowser="IE";
		
		switch(targetBrowser) {
		case"chrome":
		
System.out.println("open chrome browser");		
		break;
		
		
		case"IE":
			
		System.out.println("open IE browser");
		break;
		case "SAFARI":
		System.out.println("open SAFARI browser");
		break;
		
		default:
		break;
		
		}
	}
}
