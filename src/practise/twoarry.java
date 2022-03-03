package practise;

public class twoarry {
	public static void main(String[] args) {
		
		
		int arr[][] = {{33,4,22,66,110},{200,670,45,679,-9}};
		
		int maxnumber = arr[0][0];
		
		
		for(int i = 0 ; i <arr.length;i++) {
			
			for(int j = 0 ; j < arr[i].length;j++) {
				
				if(maxnumber <arr[i][j]) {
					
					maxnumber = arr[i][j];
				}
			}
			//System.out.println(maxnumber);
		}
		System.out.println(maxnumber);

}
}