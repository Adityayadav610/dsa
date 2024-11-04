class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();  
        int n = chars.length;  
        
        
        for (int i = 0; i < n / 2; i++) {  
           
            char leftChar = chars[i];  
            char rightChar = chars[n - 1 - i];  
            
             
            if (leftChar != rightChar) {  
                char minChar = (char) Math.min(leftChar, rightChar);  
                chars[i] = minChar;  
                chars[n - 1 - i] = minChar;  
            }  
        }  
        
         
        return new String(chars); 
        
    }
}