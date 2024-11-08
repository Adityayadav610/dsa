class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
         int n = nums.length;  
        int[] answer = new int[n];  
        int currentXor = 0;  
 
        for (int num : nums) {  
            currentXor ^= num;  
        }  

         
        int maxK = (1 << maximumBit) - 1;  

       
        for (int i = 0; i < n; i++) {  
             
            int k = maxK ^ currentXor;  
            answer[i] = k;  

              
            currentXor ^= nums[n - 1 - i];  
        }  

        return answer;  
        
    }
}