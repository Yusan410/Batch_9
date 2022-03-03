package homework;

public class Task6 {
	public static void main(String[] args) {
		
//		Task7:
//		Write a Java program to find the index of an array element.
//		
//		find index of "Jenkins"
		
//	    String[] my_array2 = {
//        "Java",
//		
//        "Python",
//        "PHP",
//        "C#",
//        "C Programming",
//        "C++",
//        "Jenkins",
//        "SQL"
//    };
		String[] arr = { "Java", "Python", "PHP", "C#", "C Programming", "C++", "Jenkins", "SQL" };
		
		String target = "C#";
		
		for(int i = 0 ; i < arr.length; i++) {
			
			if(target.equals(arr[i])) {
				
				
				System.out.println("Index of element :"+i);
			}
		}
	
		
		
	}

}
