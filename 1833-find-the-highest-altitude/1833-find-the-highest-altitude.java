class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0;
        int high=0;
        for(int i:gain){
            curr +=i;
            if(curr>high){
                high=curr;
            }
        }
        return high;
        
    }
}