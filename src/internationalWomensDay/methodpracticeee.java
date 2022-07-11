package internationalWomensDay;

public class methodpracticeee {
	
	public static void main(String[] args) {
		
		
		methodpracticeee m = new methodpracticeee();
		
		int nums1[] = {22,100,98};
		int num2[]= {100,99,238,-0};
		
		m.arr(num2);
		
		m.reverse("nasuY");
		
		
	}
	
	public void arr(int num[]) {
		
		int maxvalue =num[0];
		
		for(int i=0; i < num.length;i++) {
			
			if(num[i]>maxvalue) {
				
				maxvalue = num[i];
			}
		}
		
		System.out.println(maxvalue);
		
		
	}
	
	public void reverse(String str) {
		
		String reversestr =" ";
		
		
		for(int i = str.length()-1; i >=0; i--) {
			
			String letter = String.valueOf(str.charAt(i));
			
			
			reversestr +=letter;
			
		}
		
		System.out.println(reversestr);
	}

}
