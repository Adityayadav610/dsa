class Solution {
    public int findKthPositive(int[] arr, int k) {
         int missingCount = 0;  
        int currentPositive = 1; 
        int index = 0; 
        
        while (missingCount < k) {  
             
            if (index < arr.length && arr[index] == currentPositive) {  
                index++;   
            } else {  
                  
                missingCount++;   
                if (missingCount == k) {  
                    return currentPositive;   
                }  
            }  
            currentPositive++;   
        }  
        
        return -1; 
        
    }
}