class Solution {
    public int[] findColumnWidth(int[][] grid) {
       int m = grid.length; 
        int n = grid[0].length;  
        int[] widths = new int[n];   
        for (int j = 0; j < n; j++) {  
            for (int i = 0; i < m; i++) {   
                 
            int length = (grid[i][j] < 0) ? String.valueOf(grid[i][j]).length() : String.valueOf(grid[i][j]).length();  
                 
                if (length > widths[j]) {  
                    widths[j] = length;  
                }  
            }  
        }  
        
        return widths;  
    }
}