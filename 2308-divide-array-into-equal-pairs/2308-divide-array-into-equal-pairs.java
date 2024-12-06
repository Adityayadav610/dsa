class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
      
        if(n%2!=0){
            return false;
        }
        for(int i=0;i<n;i+=2){
            if(nums[i]!=nums[i+1]){
             return false;
            }
            
        

        }
        return true;

        
    }
}