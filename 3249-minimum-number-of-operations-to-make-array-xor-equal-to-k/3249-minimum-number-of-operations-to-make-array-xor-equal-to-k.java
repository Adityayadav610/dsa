class Solution {
    public int minOperations(int[] nums, int k) {
        int currentXOR = 0;  
        for (int num : nums) {  
            currentXOR ^= num;  
        }  
        
       
        int targetXOR = currentXOR ^ k;  
        
         
        return countBits(targetXOR);  
    }  
    
    
    private static int countBits(int num) {  
        int count = 0;  
        while (num != 0) {  
            count += (num & 1);  
            num >>= 1;  
        }  
        return count;  
    }  
        
    
}