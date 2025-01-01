class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = 0;  
        int bestDivisor = Integer.MAX_VALUE;  

         
        for (int divisor : divisors) {  
            int score = 0;  
             
            for (int num : nums) {  
                if (num % divisor == 0) {  
                    score++;  
                }  
            }  
            
             
            if (score > maxScore || (score == maxScore && divisor < bestDivisor)) {  
                maxScore = score;  
                bestDivisor = divisor;  
            }  
        }  
        
        return bestDivisor; 
    }
}