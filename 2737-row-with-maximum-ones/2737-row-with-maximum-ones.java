class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnesCount = -1;  
        int rowIndex = -1;  

        for (int i = 0; i < mat.length; i++) {  
            int count = 0;  

            for (int j = 0; j < mat[i].length; j++) {  
                if (mat[i][j] == 1) {  
                    count++;  
                }  
            }  

            if (count > maxOnesCount) {  
                maxOnesCount = count;  
                rowIndex = i;  
            }  
        }  

        return new int[] { rowIndex, maxOnesCount };  
    
        
    }
}