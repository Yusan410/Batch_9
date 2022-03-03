package day34_remotedirverTest;

public class FireFoxDriver extends RemoteDriver{

	
		private String url;
		
		
		public String getUrl() {
			
			return this.url;
		}
		
		public void setUrl(String url) {
			
			this.url=url;
			
			
			
		}
		
		
	

	@Override
	public void takeScreenShot(String imageName) {
		
		
		System.out.println("Taking screenshot on Firefox, on "+imageName+"page");
		
		
	}

	@Override
	public void get(String url) {
		
		//this.url = url;
		setUrl(url);
		
		System.out.println("Navigeting  <"+getUrl()+" onfirefox");
	}

	@Override
	public void close() {
		
		System.out.println("Closing firefox browser");
		 
		
	}

	@Override
	public void quit() {
		
		System.out.println("quiting firefox browser");
		
		
	}

	@Override
	public String getCurrentUrl() {
		
		return getUrl();
	}

	@Override
	public String getTitle() {
		
		return "login page";
	}

}
