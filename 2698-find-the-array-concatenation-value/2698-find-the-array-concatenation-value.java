class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concatenationValue = 0; 
        int left = 0; 
        int right = nums.length - 1;  

        while (left <= right) {  
            if (left == right) { 
                concatenationValue += nums[left];  
            } else { 
                
        String concatenated = Integer.toString(nums[left]) + Integer.toString(nums[right]);  
                concatenationValue += Long.parseLong(concatenated);  
            }  
            left++;   
            right--;   
        }  

        return concatenationValue; 
        
    }
}