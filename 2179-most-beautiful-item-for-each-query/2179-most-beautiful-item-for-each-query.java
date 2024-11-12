class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));  

        
        int n = items.length;  
        int[] maxBeautyUpToPrice = new int[n];  
        int maxBeauty = 0;  

        for (int i = 0; i < n; i++) {  
            maxBeauty = Math.max(maxBeauty, items[i][1]);  
            maxBeautyUpToPrice[i] = maxBeauty;  
        }  

        
        int[] answer = new int[queries.length];  

        for (int i = 0; i < queries.length; i++) {  
             
            int low = 0;  
            int high = n - 1;  
            int maxBeautyForQuery = 0;  

            while (low <= high) {  
                int mid = low + (high - low) / 2;  
                if (items[mid][0] <= queries[i]) {  
                    maxBeautyForQuery = maxBeautyUpToPrice[mid]; 
                    low = mid + 1; 
                } else {  
                    high = mid - 1;  
                }  
            }  

            answer[i] = maxBeautyForQuery; 
        }  

        return answer; 
      

        
    }
}