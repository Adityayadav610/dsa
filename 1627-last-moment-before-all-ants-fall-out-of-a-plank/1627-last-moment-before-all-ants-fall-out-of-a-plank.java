class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
         int maxLeftTime = (left.length > 0) ? Arrays.stream(left).max().getAsInt() : 0;  
        int maxRightTime = (right.length > 0) ? Arrays.stream(right).map(r -> n - r).max().getAsInt() : 0;  

        return Math.max(maxLeftTime, maxRightTime);  
    }
}