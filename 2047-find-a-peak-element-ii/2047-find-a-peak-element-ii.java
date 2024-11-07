class Solution {
    public int[] findPeakGrid(int[][] mat) {
         
        int m = mat.length;  
        int n = mat[0].length;  

        return findPeakUtil(mat, 0, n - 1, m);  
    }  

    private int[] findPeakUtil(int[][] mat, int left, int right, int m) {  
        int mid = left + (right - left) / 2;  
        int maxRowIndex = 0;  

        for (int i = 0; i < m; i++) {  
            if (mat[i][mid] > mat[maxRowIndex][mid]) {  
                maxRowIndex = i;  
            }  
        }  

         
        if ((mid == 0 || mat[maxRowIndex][mid] > mat[maxRowIndex][mid - 1]) &&  
            (mid == right || mat[maxRowIndex][mid] > mat[maxRowIndex][mid + 1])) {  
            return new int[]{maxRowIndex, mid};  
        }  

         
        if (mid < right && mat[maxRowIndex][mid + 1] > mat[maxRowIndex][mid]) {  
            return findPeakUtil(mat, mid + 1, right, m);  
        }  

        
        return findPeakUtil(mat, left, mid - 1, m);  
        
    }
}