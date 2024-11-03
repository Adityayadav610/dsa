class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       int ans=arrivalTime+delayedTime;
       if(ans>=24){
        ans=Math.abs(24-ans);
       }
       return ans;

        
    }
}