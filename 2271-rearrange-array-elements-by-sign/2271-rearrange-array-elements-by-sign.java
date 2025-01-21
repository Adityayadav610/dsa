class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int left=0;
        int right=1;
        for(int num:nums){
            if(num>0){
                ans[left]=num;
                left+=2;
            }
            else{
                ans[right]=num;
                right+=2;
            }
        }
        return ans;
        
    }
}