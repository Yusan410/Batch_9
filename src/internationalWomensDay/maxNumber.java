package internationalWomensDay;

public class maxNumber {
	
	public static void main(String[] args) {
		
		
		int arr[][]= {{55,66,77,88,789},{100,200,37}};
		
		int maxnum = arr[0][0];
		
		
		for(int i = 0 ; i < arr.length;i++) {
			
			for(int j = 0 ; j < arr[i].length;j++) {
				
				
				if(maxnum  < arr[i][j]) {
					
					maxnum = arr[i][j];
				}
			}
			
			
		}
		System.out.println(maxnum);
	}

}
