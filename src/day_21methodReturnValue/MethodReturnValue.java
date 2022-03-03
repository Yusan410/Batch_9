package day_21methodReturnValue;

public class MethodReturnValue {
	public static void main(String[] args) {

	MethodReturnValue mr = new MethodReturnValue();
	
	mr.add2value(2, 3);
	
 int result = mr.add2value(2, 3);
 System.out.println(result);
 
 int result2 = mr.add2value(30, 25);
 
 System.out.println(result2+result);
	
 
 int result3 = mr.add2value(100, 200)+mr.add2value(100, -200);
 
 System.out.println(result3);
 
 
	}
	public int add2value(int a , int b) {
		int result = a+b;
		//System.out.println(a+b);
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
