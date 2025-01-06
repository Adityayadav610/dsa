class Solution {
    public int countValidSelections(int[] nums) {
        int validCount = 0;  
        int n = nums.length;  

          
        for (int i = 0; i < n; i++) {  
            if (nums[i] == 0) {  
                
                if (canReachAllZeroes(nums, i, -1)) {  
                    validCount++;  
                }  
                 
                if (canReachAllZeroes(nums, i, 1)) {  
                    validCount++;  
                }  
            }  
        }  
        
        return validCount;  
    }  

    private boolean canReachAllZeroes(int[] nums, int start, int direction) {  
        int[] temp = nums.clone();  
        int curr = start;  

        while (curr >= 0 && curr < temp.length) {  
            if (temp[curr] == 0) {  
                curr += direction;  
            } else {  
                temp[curr]--;   
                direction *= -1; 
                curr += direction;   
            }  
        }  
        
         
        for (int num : temp) {  
            if (num != 0) {  
                return false;  
            }  
        }  
        
        return true;  
       
        
    }
}