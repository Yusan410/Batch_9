package InterviewQuestions;

import java.util.ArrayList;

public class interviewQ {
	public static void main(String[] args) {
		
		ArrayList<String> strings= new ArrayList<String>();
		
		
		strings.add("hello");
		strings.add("world");
		strings.add("Batch9");
		strings.add("Batch9");
		strings.add("Batch9");
		ArrayList<String> unieque = new ArrayList<String>();
		
	
		for(String s : strings) {
			
	      if(!unieque.contains(s)) {
				
				unieque.add(s);
				
				
			}
			
			
			
		}
			
		System.out.println(unieque);
			
		
		}
		
	

}
