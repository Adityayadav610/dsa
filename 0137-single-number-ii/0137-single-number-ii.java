class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        
       
        }
        for(int num:mp.keySet()){
            if(mp.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}