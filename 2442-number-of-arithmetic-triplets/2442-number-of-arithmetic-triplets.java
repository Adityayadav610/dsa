class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j;k<n;k++){
                    if(i<j && j<k && (nums[j]-nums[i])==diff){
                    if((nums[k]-nums[j])==diff){
                        count++;
                    }
                    }
                }
            }
        }
        return count;
        
    }
}