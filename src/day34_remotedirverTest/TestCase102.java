package day34_remotedirverTest;

public class TestCase102 {
	/**
	 * 
	 * TC102 VALIDATE page title
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
	//ChromeDriver driver = new ChromeDriver();
		
		
		//FireFoxDriver driver = new FireFoxDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new FireFoxDriver();
		
		String url= "www.teccirchel.com";
		
		driver.get(url);
		
		String pageUrl = driver.getCurrentUrl();
		
		//assertion assertEquals(expectedValue , actualValue);
		
		if(url.equalsIgnoreCase(pageUrl)) {
			
			System.out.println("you are at the correct page");
			
			String pageTitle = "login page";
			
			if(pageTitle.equals(driver.getTitle())) {
				
				
				System.out.println("Test 102 passed");
				
			}else {
				
				System.err.println("Navigation failed");
			}
			
			//driver.takeScreenShot("login page validation");
			
		}else {
			
			System.err.println("Navigation failed");
		}
		
		driver.close();
	}
}
