class Solution {
    public int longestString(int x, int y, int z) {
          int length = 0;  
        length += z * 2;  

        while (x > 0 && y > 0) {  
            length += 4;  
            x--;  
            y--;  
        }  

        if (x > 0) {  
            length += Math.min(x, 1) * 2;  
        }  

        if (y > 0) {  
            length += Math.min(y, 1) * 2;  
        }  

        return length;  
    }
}