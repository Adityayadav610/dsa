class Solution {
    public String stringHash(String s, int k) {
         int n = s.length();  
        StringBuilder result = new StringBuilder();  

         
        int numSubstrings = n / k;  

          
        for (int i = 0; i < numSubstrings; i++) {  
            String substring = s.substring(i * k, (i + 1) * k);  
            int sumHash = 0;  

             
            for (char c : substring.toCharArray()) {  
                sumHash += (c - 'a'); 
            }  

             
            int hashedCharIndex = sumHash % 26;  
            char hashedChar = (char) ('a' + hashedCharIndex); 

            
            result.append(hashedChar);  
        }  

        return result.toString();  
    }
}