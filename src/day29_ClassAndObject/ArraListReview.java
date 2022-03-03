package day29_ClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraListReview {

	public static void main(String[] args) {
		
		
		Integer nums[] = {1,2,3,4,5,12,1,2,3,4,5,34,45};
		
		
ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(nums));	
ArrayList<Integer> uniqueElent = new ArrayList<>();
ArrayList<Integer> nonDuplicate = new ArrayList<>();
ArrayList<Integer> duplicatElment= new ArrayList<>();

System.out.println(numsList);
		
		
		
		//Collections.frequency(, nums)


System.out.println(Collections.frequency(numsList, 1));
System.out.println(Collections.frequency(numsList, 12));

System.out.println(numsList.contains(4));

for( Integer num: numsList) {
	
	
	if(!uniqueElent.contains(num)) {
		
		uniqueElent.add(num);
	}
	
	
	if(Collections.frequency(numsList, num)==1) {
		
		nonDuplicate.add(num);
	}
	

	if(Collections.frequency(numsList, num)>1) {
		
		duplicatElment.add(num);
	
}

//System.out.println(uniqueElent);

//System.out.println(nonDuplicate);

//System.out.println(duplicatElment);

	}

System.out.println(uniqueElent);

System.out.println(nonDuplicate);

System.out.println(duplicatElment);

}
}
