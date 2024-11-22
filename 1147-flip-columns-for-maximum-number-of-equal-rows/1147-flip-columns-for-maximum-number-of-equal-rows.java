class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;  

        HashMap<String, Integer> patternCount = new HashMap<>();  
        int maxRows = 0;  

        for (int[] row : matrix) {  
             
            StringBuilder pattern = new StringBuilder();  
            for (int j = 0; j < row.length; j++) {  
                  
                pattern.append((row[0] ^ row[j]) == 1 ? '1' : '0');  
            }  
            String pat = pattern.toString();  
             
            patternCount.put(pat, patternCount.getOrDefault(pat, 0) + 1);  
            
            maxRows = Math.max(maxRows, patternCount.get(pat));  
        }  

        return maxRows;  
        
    }
}