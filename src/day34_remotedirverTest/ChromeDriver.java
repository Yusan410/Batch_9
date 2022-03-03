package day34_remotedirverTest;

public class ChromeDriver extends RemoteDriver  {
	
	
	
	//private String url;
	
	
	
	//public String geturl() {
		
		
		
	//	return this.url;
		
		
		
	//}
	//public void seturl(String url) {
		
		
	//	this.url=url;
		
		
		
	//}
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void takeScreenShot(String imageName) {
		
		System.out.println("Taking screenshot on chromedriver, on "+imageName+"page");
		
		
	
		

	
	}

	@Override
	public void get(String url) {
		
		//seturl(url);
		
		
		
		
	System.out.println("Navigeting to <"+url+ " on chrome browser");
		
	}

	@Override
	public void close() {
		System.out.println("Closing chrome browser");
		
	}

	@Override
	public void quit() {
		System.out.println("Quiting Chrome browser");
		
	}

	@Override
	public String getCurrentUrl() {
		
		return null;
	}

	@Override
	public String getTitle() {
		
		return null;
	}

}
