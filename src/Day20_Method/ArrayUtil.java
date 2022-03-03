package Day20_Method;

public class ArrayUtil {

		
		
		

    public void maxValueFromIntegerArray(int nums[]) {
    

        int maxValue = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }

        }

        System.out.println(maxValue);
    }

    public static void main(String[] args) {
         
        int nums1[] = {12,2,3,4,4,6}; // 12
        int nums2[] = {12,2,3,4,4,66};//66
        int nums3[] = {12,2,333,4,4,66};//333
        
        ArrayUtil au = new ArrayUtil();
        
        au.maxValueFromIntegerArray(nums2); //66
        
        au.maxValueFromIntegerArray(nums3);
        
        au.maxValueFromIntegerArray(nums1);
    }
    
    
    
    
    
    
    
    
    
    
    

}
		
		
		
		

	

