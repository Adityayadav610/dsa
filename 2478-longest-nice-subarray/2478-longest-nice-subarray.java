class Solution {
    public int longestNiceSubarray(int[] nums) {
       int n = nums.length;  
        HashSet<Integer> set = new HashSet<>();  
        int maxLength = 0;  
        int left = 0;  
        int combinedBits = 0;

        for (int right = 0; right < n; right++) {  
            while ((set.contains(nums[right]) || (combinedBits & nums[right]) != 0) && left <= right) {  
                combinedBits ^= nums[left];  
                set.remove(nums[left]);  
                left++;  
            }  
            set.add(nums[right]);  
            combinedBits |= nums[right]; 
            maxLength = Math.max(maxLength, right - left + 1);  
        }  

        return maxLength;    
    }
}