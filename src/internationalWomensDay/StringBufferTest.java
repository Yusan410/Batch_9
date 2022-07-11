package internationalWomensDay;



public class StringBufferTest {
	
	public static void main(String[] args) {
		
		
		StringBuilder str = new StringBuilder("Yusan");
		
		
		str.append(" Ali");
		str.reverse();
		
		System.out.println(str);
		
		str.delete(0, 6);
		
		System.out.println(str);
		
		//String buffer are safe for use multithread . the method are sycronized;
		
		
		
		//String builder not gurantee the sycroniztions
				
				
			}
	
	
}
