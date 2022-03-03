package homework;

import java.util.Arrays;

public class Homework {
	public static void main(String[] args) {
		
		 int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
	        
	        
	        /*
	    l    3 2 1
	        8 7 6 5 4
	        13 12 11 10 9
	        */
		 
		 for(int i = 0 ; i < arr2D.length;i++) {
			// System.out.println(Arrays.toString(arr2D[i]));
			 
			 for (int j = arr2D.length-1; ; j--) {
				 
				 int arr[]= new int [arr2D[i].length];
			 
			 System.out.println(arr2D[i][j]);
			
		 }
			 //System.out.println(arr2D[i][j]);
		 }
		//System.out.println(arr2D[i][j]);
	}
	
	// System.out.println(arr2D[i][j]);
}
	


