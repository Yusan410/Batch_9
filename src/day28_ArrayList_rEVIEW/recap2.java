package day28_ArrayList_rEVIEW;

import java.util.ArrayList;
import java.util.Arrays;

public class recap2 {
	public static void main(String[] args) {
		
        String names = "Gulhayat,Aim,Yasin,Anuwat,Brekhna,Chatchaya,Daniel,Erdni,"
                + "Henry,Jandery,Karakat,Liubov, luck, Merfu, Naran, Onanong, Parween, Pete, Bahar, Siri,"
                + "Victoria, Maria, Unyada, Narisa, Warawat";
        ArrayList<String> nameEndWithA = new ArrayList();
        ArrayList<String> nameStartWithL = new ArrayList();
        ArrayList<String> namecontainR = new ArrayList();
        
        
        
      String arr[]= names.split(",");
        	
    //  System.out.println(Arrays.toString(arr));
        	
        	for(String name : arr) {
        		
        		if(name.endsWith("a")) {
        			
        			nameEndWithA.add(name);
        			
        			
        		}
        		
        		if(name.startsWith("L")) {
        			
        			
        			nameStartWithL.add(name);
        			
        		}
        		
        		
        		if(name.contains("r")) {
        			
        			
        			namecontainR.add(name);
        		}
        		
        		
        		
        	}
        	
        	System.out.println(nameEndWithA);
        	System.out.println(nameStartWithL);
        	System.out.println(namecontainR);
        }
      
        
	}
	
	
	

