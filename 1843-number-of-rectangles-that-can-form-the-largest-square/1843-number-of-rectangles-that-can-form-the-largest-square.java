class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxlen=0;
        for(int[] rec:rectangles){
            int s=Math.min(rec[0],rec[1]);
            maxlen=Math.max(maxlen,s);
        }
        int count=0;
        for(int[] rec:rectangles){
            if(rec[0]>=maxlen && rec[1]>=maxlen){
                count++;
            }
        }
        return count;
    }
}