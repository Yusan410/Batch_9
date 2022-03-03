package day34_remotedirverTest;

public interface WebDriver {
	
	
	
	void get(String url);
	
	void close();
	
	void quit();
	
	String getCurrentUrl();
	String getTitle();
	
	

}
