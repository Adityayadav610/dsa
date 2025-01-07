class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char longestKey=keysPressed.charAt(0);
        int maxDuration=releaseTimes[0];
        for(int i=1;i<keysPressed.length();i++){
            int duration=releaseTimes[i]-releaseTimes[i-1];
            if(duration >maxDuration ||(duration == maxDuration && keysPressed.charAt(i)>longestKey)){
               maxDuration=duration;
               longestKey=keysPressed.charAt(i); 
            }
        }
        return longestKey;
    }
}