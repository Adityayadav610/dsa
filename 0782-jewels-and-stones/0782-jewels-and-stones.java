class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch1:jewels.toCharArray()){
            for(char ch2:stones.toCharArray()){
                if(ch1==ch2){
                    count++;
                }
            }
        }
        return count;
        
    }
}