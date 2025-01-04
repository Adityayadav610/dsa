class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int max=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
           if(nums[i]==1){
                ans++;
           }else{
            ans--;
           }
           if(map.containsKey(ans)){
            int length=i-map.get(ans);
            max=Math.max(max,length);
           }else{
            map.put(ans,i);
           }

        }
        return max;
        
    }
}