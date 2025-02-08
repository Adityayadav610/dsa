class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPtr = 0, tPtr = 0;  

        while (tPtr < t.length() && sPtr < s.length()) {  
            if (s.charAt(sPtr) == t.charAt(tPtr)) {  
                sPtr++;  
            }  
            tPtr++;  
        }  

        return sPtr == s.length(); 
    }
}