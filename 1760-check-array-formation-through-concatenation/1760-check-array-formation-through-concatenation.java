class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
         Map<Integer, int[]> pieceMap = new HashMap<>();  
        for (int[] piece : pieces) {  
            pieceMap.put(piece[0], piece);  
        }  

        
        int i = 0;  
        while (i < arr.length) {  
             
            if (pieceMap.containsKey(arr[i])) {  
                int[] piece = pieceMap.get(arr[i]);  
                 
                for (int num : piece) {  
                    if (i < arr.length && arr[i] == num) {  
                        i++;  
                    } else {  
                        
                        return false;  
                    }  
                }  
            } else {  
               
                return false;  
            }  
        }  
         
        return true; 
        
    }
}