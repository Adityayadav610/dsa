class Solution {  
    public String truncateSentence(String s, int k) {  
         
        String[] words = s.split(" ");  
        
        
        int limit = Math.min(k, words.length);  

      
        StringBuilder result = new StringBuilder();  
        
        for (int i = 0; i < limit; i++) {  
            result.append(words[i]);  
            if (i < limit - 1) { 
                result.append(" ");  
            }  
        }  
        
        return result.toString();  
    }  
}