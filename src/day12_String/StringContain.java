package day12_String;

public class StringContain {
 public static void main(String[] args) {
	
	 //string contain {true ,false}
	 
	 String name = "Yusan  Samira";
	 
	 System.out.println(name.contains("samira"));// true //lower case false
	 
	 
	 
	 System.out.println(name.toUpperCase());
	 System.out.println(name.toUpperCase().contains("samira".toUpperCase()));
	 
	 
	 String str = "Techirchle";
	 
	 System.out.println(str.contains("Tec"));
	 
	 System.out.println(str.contains("QA"));
	 
	 
	 
	 
	 if (str.contains("Tech")) {
		 str = str.toUpperCase();
	 }
	 System.out.println(str);
	 
	    if (str.contains("TECH")) {
	    	str=str.toLowerCase();
	    }
	    System.out.println(str);
	    
	    System.out.println(str.contains("s"));
	    System.out.println(str.contains("l"));
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
