class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0 ){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int n=nums.length;
        int max1=nums[0];
        int max2=nums[0];
        for(int i=1;i<n;i++){
            max1=Math.max(nums[i],max1+nums[i]);
            if(max1>max2){
                max2=max1;
            }
            
           
        }
        return max2;
        
    }
}