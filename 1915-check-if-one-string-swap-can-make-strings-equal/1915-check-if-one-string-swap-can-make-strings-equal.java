class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
         int n = s1.length();  
        
        if (n != s2.length()) {  
            return false;  
        }  

        int count = 0;  
        int[] indices = new int[2];  

        for (int i = 0; i < n; i++) {  
            if (s1.charAt(i) != s2.charAt(i)) {  
                if (count < 2) {  
                    indices[count] = i;   
                }  
                count++;  
                if (count > 2) {  
                    return false;  
                }  
            }  
        }  

        if (count == 0) {  
            return true;   
        } else if (count == 2) {  
            return s1.charAt(indices[0]) == s2.charAt(indices[1]) &&   
                   s1.charAt(indices[1]) == s2.charAt(indices[0]);  
        }  

        return false;   
    }
}