class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddCount = 0;  
        int evenCount = 0;  
        
        for (int pos : position) {  
            if (pos % 2 == 0) {  
                evenCount++;  
            } else {  
                oddCount++;  
            }  
        }  
        
        return Math.min(oddCount, evenCount);   
    }
}