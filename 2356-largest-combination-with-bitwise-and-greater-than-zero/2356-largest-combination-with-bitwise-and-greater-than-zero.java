class Solution {
    public int largestCombination(int[] candidates) {
        int mCount=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int num:candidates){
                if((num&(1<<i)) !=0){
                    count++;
                }
            }
            mCount=Math.max(mCount,count);

        }
        return mCount;
       
        
    }
}