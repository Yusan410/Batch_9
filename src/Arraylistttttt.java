import java.util.ArrayList;
import java.util.Arrays;


public class Arraylistttttt {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> num1 = new ArrayList();
		
		ArrayList<Integer> num2 = new ArrayList();
		
		for(int i = 1 ; i < 101;i++) {
			
			
			System.out.println(i);
			
			if(i % 2==0) {
				
				num1.add(i);
			}else{
				
				num2.add(i);
			}
			
			//System.out.println(num1);
		}
		System.out.println(num1);
		//System.out.println(num2);
	}
	


}
