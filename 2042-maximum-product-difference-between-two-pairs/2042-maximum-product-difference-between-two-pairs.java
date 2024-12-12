class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);  
          
        int maxPairProduct = nums[nums.length - 1] * nums[nums.length - 2];  
        
        int minPairProduct = nums[0] * nums[1];  
        
        
        return maxPairProduct - minPairProduct;  
    }  
}   
