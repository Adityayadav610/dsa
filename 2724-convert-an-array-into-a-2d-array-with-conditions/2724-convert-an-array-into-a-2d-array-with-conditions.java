class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       Map<Integer,Integer> freq=new HashMap<>();
       for(int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);

       }
       int maxFreq=0;
       for(int count:freq.values()){
        maxFreq=Math.max(maxFreq,count);

       }
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<maxFreq;i++){
        ans.add(new ArrayList<>());
       }
       for(Map.Entry<Integer,Integer> s:freq.entrySet()){
         int num=s.getKey();
         int count=s.getValue();
         for(int i=0;i<count;i++){
            ans.get(i).add(num);
         }
       }
       return ans;
    }
    
}