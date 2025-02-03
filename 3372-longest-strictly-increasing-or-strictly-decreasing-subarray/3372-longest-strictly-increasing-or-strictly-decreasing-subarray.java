class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0) {  
            return 0;  
        }  

        int maxLength = 1;  
        int currentIncreasingLength = 1;  
        int currentDecreasingLength = 1;  

        for (int i = 1; i < nums.length; i++) {  
            if (nums[i] > nums[i - 1]) {  
                currentIncreasingLength++;  
                currentDecreasingLength = 1;  
            } else if (nums[i] < nums[i - 1]) {  
                currentDecreasingLength++;  
                currentIncreasingLength = 1;  
            } else {  
                currentIncreasingLength = 1;  
                currentDecreasingLength = 1; 
            }  

            maxLength = Math.max(maxLength, Math.max(currentIncreasingLength, currentDecreasingLength));  
        }  

        return maxLength;  
        
    }
}