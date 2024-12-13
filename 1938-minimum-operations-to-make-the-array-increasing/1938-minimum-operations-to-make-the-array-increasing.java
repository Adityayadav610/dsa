class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
            int inc=nums[i-1]-nums[i]+1;
            count +=inc;
            nums[i]+=inc;
                
            }
            
            
        }
        return count;
        
    }
}