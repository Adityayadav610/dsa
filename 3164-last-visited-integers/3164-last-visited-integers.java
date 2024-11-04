class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        int n=nums.length;
        List<Integer> seen=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int count=0;
        for(int num:nums){
            if(num!=-1){
                seen.add(0,num);
                count=0;
            }
            else{
                count++;
                if(count<=seen.size()){
                 ans.add(seen.get(count-1)); 
                }
                else{
                    ans.add(-1);

                }
            }
        }
        return ans;

        
    }
}