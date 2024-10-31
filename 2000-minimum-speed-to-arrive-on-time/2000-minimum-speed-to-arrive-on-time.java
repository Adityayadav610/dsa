class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 1; 
        int right = (int) 1e7; 
        int result = -1;  

        while (left <= right) {  
            int mid = left + (right - left) / 2;  
            if (canReachOnTime(dist, mid, hour)) {  
                result = mid;  
                right = mid - 1; 
            } else {  
                left = mid + 1; 
         } 
        } 
        return result;  
            
    } 

    private boolean canReachOnTime(int[] dist, int speed, double hour) {  
        double totalTime = 0.0;  
        for (int i = 0; i < dist.length; i++) {  
            totalTime += (double) dist[i] / speed;  
            if (i < dist.length - 1) {  
                totalTime = Math.ceil(totalTime); 
            }  
        }  
        return totalTime <= hour;  
    }  

        
    
}