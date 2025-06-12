class Solution {
    public int findClosestNumber(int[] nums) {
        int n=nums.length;
       int min=nums[0];
       int ans=nums[0];
       for(int num:nums){
        if(Math.abs(num)<Math.abs(ans)){
            min=Math.abs(num);
            ans=num;
        }
        else if(Math.abs(num)==Math.abs(min)){
            min=Math.max(num,min);
            ans=min;
        }
       }
       return ans;
    }
}