 class Solution {  
    public int minimumSize(int[] nums, int maxOperations) {  
        int left = 1;  
        int right = 0;  
 
        for (int num : nums) {  
            right = Math.max(right, num);  
        }  

         
        while (left < right) {  
            int mid = left + (right - left) / 2;  
            int operationsNeeded = 0;  

             
            for (int num : nums) {  
                if (num > mid) {  
                   
                    operationsNeeded += (num - 1) / mid; 
                }  
            }  

             
            if (operationsNeeded <= maxOperations) {  
                right = mid;   
            } else {  
                left = mid + 1;   
            }  
        }  

        return left;  
    }  

   
}