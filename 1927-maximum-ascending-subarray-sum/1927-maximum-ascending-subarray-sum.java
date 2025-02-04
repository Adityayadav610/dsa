class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int sum=nums[0];
        int temp=nums[0];
        int max=0;
        for(int i=0;i<n-1;i++){
            if(i==0 && nums[i]>=nums[i+1]){
                max=nums[i];
            }
            if(nums[i]<nums[i+1]){
               // max=0;
                sum+=nums[i+1];
                if(max<sum){
                    max=sum;
                }
            }
           else{
            sum=nums[i+1];
           }
            
            
        }
        //sum=0;
       return max;
    }
}