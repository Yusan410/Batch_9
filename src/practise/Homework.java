package practise;

import java.util.Arrays;

public class Homework {

	public static void main(String[] args) {

		/*
		 * Create an method that accepts an array of int as parameter and returns the
		 * maximum number
		 */

		Homework cc = new Homework();

		int arr[] = { 77, 88, 99 ,8,100};

	        int maxvalue = cc.maxnumber(arr);
	        
	        System.out.println(maxvalue);
	        
	        System.out.println("-------------------------");
	        
	        
//	    	2,
	    	
	        /*
	         * Create an method that accepts an array of int as parameter and
	           returns the minimum number from an array of integer
	         */
	    	
	        
	        
	      int minvalue = cc.minnumber(arr);
	      System.out.println(minvalue);
          System.out.println("----------------------");
          
          
          /*
     	  * Create an method that accepts array of double as parameter and
             returns the minimum number from an array of double
          */
          
     int arr2[][]= {{7,44,55,66,33,88},{98,76,50,43,51,5,2},{34,3,45,90,63,}};
     
     
          int minNumber = cc.minNumber(arr2);
          System.out.println(minNumber);
          
          System.out.println("______________________");
          
//      	4,
    	  /*Create an method that accepts array of double as parameter and
            returns the maximum number from an array of double
         */
    	
    	int maxxvalue = cc.MaxNumber(arr2);
    	
    	System.out.println(maxxvalue);
    	
    	System.out.println("--------------");
    	
    	   /*
 	    * Create a method that
 		    Combines two arrays of integers and returns the new array
 		*/
 	
          int arr3[]= {1,2,3,4,5,6};
          
         int arr4 []= {7,8,9,10,11,12};
         
         String result = cc.combainarray(arr3, arr4);
         
         System.out.println(result);
         
//     	6,
     	
  	   /*
  	    * Create a method that
  		    Combines two arrays of char and return the new array
  		 */
  	System.out.println("-------------------");
  	
  	char Arr[] = {'a','b','c','d'};
  	
  	char Arr1[]= {'e','f','g','h'};
  	
  	
         String str3 = cc.CombainArray(Arr, Arr1);
         
         System.out.println(str3);
         
         System.out.println("-----------");
         
         /*
          *Create a method that
           Combines two arrays of String and return the new array
         */
     	
     	String ARr [] = {"a,b,c,d,"};
     	String ARR[] = {"e","f","g","h"};
     	
     	String result1 = cc.combo(ARr, ARR);
     	
     	System.out.println(result1.toUpperCase());
     	
     	System.out.println("------------");
//    	8,
        /*Create a method that
          sorts the array of integers in descending order, and returns it as an array
        */
    	
    	int array [] = {1,2,6,9,10,7};
    	
    	String result2 = cc.hhh(array);
    	
    	System.out.println(result2);
    	
    	
//    	10,
        /*
        sorts the array of char in descending order, and returns it as an array
        */
    	
    	System.out.println("--------");
    	
    	
    	char array5[] = {'e','r','h','g','a','b'};
    	
    	
    	
    	String result3 = cc.descending(array5);
    	
    	System.out.println(result3);
    	
    	
     	
 
         
	}

	public int maxnumber(int arr[]) {
		int maxvalue = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (maxvalue < arr[i]) {

				maxvalue = arr[i];

				//System.out.println(maxvalue);

			}

		}
		return maxvalue;

	}
	
	public int minnumber (int arr[]) {
		
		
		int minvalue = arr[0];
		
for( int i = 0 ; i <arr.length; i ++) {
	
	
	
	
	if (minvalue>arr[i]) {
		
		minvalue = arr[i];
	}
	
	
	
	
	
}

	return minvalue;
		
	}
	
	
	public int minNumber (int arr2[][]) {
		
		int	minNumber = arr2[0][0];
	
		
		for (int i = 0 ; i < arr2.length; i ++) {
			
			
		
		
		
		for (int j = 0 ; j <arr2[i].length; j ++) {
			
			
			
			
			if ( minNumber >arr2[i][j]) {
				
				minNumber = arr2[i][j];
				
				
			}
				
			//return minNumber;
			
		}
		
		
		}
		return minNumber;
		
	}
	
	
	
	public int MaxNumber (int arr2[][]) {
		
		int maxxvalue = arr2[0][0];
		
		for (int i = 0 ; i <arr2.length; i ++) {
			
			
			for (int j = 0 ; j < arr2[i].length; j++) {
				
				maxxvalue = arr2[i][j];
				
				if (maxxvalue < arr2[i][j]) {
					
					
					
				}
				
				
			}
			
		}
		
		return maxxvalue;
		
		
		
	}
	
	
	
	public String combainarray (int arr3[], int arr4[] ) {
		
	int arr5[] = new int [arr3.length +arr4.length];
	
	String result = "";
	
	
	for(int i = 0 ; i <arr5.length; i ++) {
		
		if (i < arr3.length) {
			
			arr5[i] = arr3[i];
			
			
		}
		if ( i >=arr3.length) {
			
			
			arr5[i] = arr4 [ i - arr3.length];
			
		}
		
			
		
		
		
		
		
	}
		
		
		
		return result = Arrays.toString(arr5);
		
		
	}
	
	public String CombainArray (char Arr[], char Arr1[]) {
		
		
		int array0[] = new int [Arr.length + Arr1.length ];
		
		String str3 = " ";
		
		
		for (int i = 0 ; i < array0.length; i++) {
			
			
		if (i < Arr.length) {
			
			
			array0[i] = Arr[i];
			
			
			
			
		}
			
			if ( i >= Arr.length) {
				
				
				array0 [i]= Arr1[i - Arr.length];
				
				
				
				
				
				
				
				
			}
			
			
		}
		
		str3  = Arrays.toString(array0);
		
		return str3;
		
	
	} 
	
	public String combo (String ARr[], String ARR[]) {
		
	String str4[] = new String [ARr.length +ARR.length];	
		
		String result1 = " ";
		
		
		for (int i = 0 ; i < str4.length; i ++) {
			
			
			if (i < ARr.length) {
				
				
				str4[i] = ARr[i];	
				
			}
				
			if (i >= ARr.length) {
				
				str4[i] = ARR [i - ARr.length];
			}
			
			
			
		}
		
result1 = Arrays.toString(str4);


		return result1;
	}
	
	
	
	public String hhh (int array[]) {
		
		
		int temp = 0;
		String result2 = "";
		
		for(int i = 0 ; i < array.length; i ++) {
			
		for(int j =i+1; j<array.length; j ++) {
			
			
		if (array[i]< array[j]) {
			
			temp = array[i];
			
			array[i] = array[j];
			
			array[j] = temp;
			
		}	
			
			
			
			
			
			
		}
		}
		
		
		
		for(int i = 0 ; i <array.length; i ++) {
			
			result2 = Arrays.toString(array);
			
			
			
		}
		
		
		return result2;
		
		
		
	}
	
	public String descending (char arr5[]) {
		
		
		String result3 = "";
		
		Arrays.sort(arr5);
		
		for (int i = arr5.length-1;i >=0; i --) {
			
			result3 = Arrays.toString(arr5);
			
			
		}
		
		
		return result3;
	}
	
	
}
		
		
		
		
		
		
	
		
		
	
	
			
	
		
		
		

		
		
	
	


